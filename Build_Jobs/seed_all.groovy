job('Seed_all') {
  scm {
    git ('https://github.com/BalajiSivarajRajan/DSL_test.git')
  }
  steps {
    dsl {
      external('Build_Jobs/*.groovy' )  
    
      removeAction('DELETE')
    }
  }
}