job('Seed All') {
  scm {
    git ('https://github.com/BalajiSivarajRajan/DSL_test.git')
  }
  steps {
    dsl {
      external('Build_jobs/*.groovy')  
    
      removeAction('DELETE')
    }
  }
}