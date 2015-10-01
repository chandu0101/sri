
 // START OF QUERY

Relay.QL`
 fragment on User {
  completedCount,
  todos(status: $status, first: $limit) {
    edges {
      node {
        id,
        ${Todo.getFragment('todo')},
      },
    },
    ${MarkAllTodosMutation.getFragment('todos')},
  },
  totalCount,
  ${MarkAllTodosMutation.getFragment('viewer')},
  ${Todo.getFragment('viewer')},
}
    `

 // END OF QUERY

       