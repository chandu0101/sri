package sri.relay.tools


import sri.relay.tools.RelayTaskScheduler.TaskExecutor

import scala.scalajs.js
import scala.scalajs.js.Promise

object RelayTaskScheduler {
  type TaskCallback = () => Unit
  type TaskExecutor = js.Function => Unit
}

/**
 * Task scheduler used by Relay internals. Each task is a synchronous unit of
 * work that can be deferred by an injected scheduler function. For example,
 * an injected scheduler can defer each task to the next animation frame:
 *
 * RelayTaskScheduler.injectScheduler(function(executeTask) {
 * // This function will be invoked whenever a task is enqueued. It will not
 * // be invoked again until `executeTask` has been invoked. Also, invoking
 * // `executeTask` more than once is an error.
 * requestAnimationFrame(executeTask);
 * });
 *
 * By default, the next task is executed synchronously after the previous one is
 * finished. An injected scheduler using `setImmediate` can alter this behavior.
 */
@js.native
trait RelayTaskScheduler extends js.Object {
  /**
   * public
   *
   * Injects a scheduling function that is invoked with a callback that will
   * execute the next unit of work. The callback will return a promise that
   * resolves with a new callback when the next unit of work is available.
   */
  def injectScheduler(injectedScheduler: (TaskExecutor) => Unit): Unit = js.native

  /**
   * internal
   *
   * Enqueues one or more callbacks that each represent a synchronous unit of
   * work that can be scheduled to be executed at a later time.
   *
   * The return value of each callback will be passed in as an argument to the
   * next callback. If one of the callbacks throw an error, the execution will
   * be aborted and the returned promise be rejected with the thrown error.
   * Otherwise, the returned promise will be resolved with the return value of
   * the last callback. For example:
   *
   * RelayTaskScheduler.await(
   * function() {
   * return 'foo';
   * },
   * function(foo) {
   * return 'bar';
   * }
   * ).then(
   * function(bar) {
   * // ...
   * }
   * );
   *
   * RelayTaskScheduler.await(
   * function() {
   * return 'foo';
   * },
   * function(foo) {
   * throw new js.Error();
   * },
   * function() {
   * // Never executed.
   * }
   * ).catch(
   * function(error) {}
   * );
   */
  def await(callbacks: Seq[(js.Any) => js.Any]): Promise[js.Any] = js.native

}
