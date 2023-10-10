package oop

interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

data class User(val id: Int, val name: String)

class UserRepository : Repository<User> {
    private val users = mutableListOf<User>()

    override fun save(item: User) {
        users.add(item)
    }

    override fun delete(item: User) {
        users.remove(item)
    }

    override fun getAll(): List<User> {
        return users
    }
}

fun main() {
    val userRepository = UserRepository()

    val user1 = User(1, "Влад")
    val user2 = User(2, "Лара")

    userRepository.save(user1)
    userRepository.save(user2)

    println(userRepository.getAll())
    userRepository.delete(user1)

    println(userRepository.getAll())
}
