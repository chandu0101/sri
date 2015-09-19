
//START_QUERY

Relay.QL`
fragment on User {
  widgets(first: 10) {
    edges {
      node {
        id,
          name,
      },
    },
  },
}`


//END_QUERy