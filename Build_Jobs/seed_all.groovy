job('Seed All') {
  scm {
    git ('https://github.com/BalajiSivarajRajan/DSL_test.git')
  }
  steps {
    dsl {
      external('Bulid_jobs/*.groovy')  
    
      removeAction('DELETE')
    }
  }
}