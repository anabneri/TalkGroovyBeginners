package groovy.talk

def hello(String saudacao) {
    "Bem vindos ao " + saudacao
}

def nomes = ['Ozzy', 'Jimmie Hendrix', 'David Gilmore']
println nomes.class

hello "Unicorntech"

def map = [nome: 'Ozzy', lang:'Groovy']
map.each { e ->
    println "${e.key} ${e.value}"
}

(1..10).each { n ->
    println n
}



