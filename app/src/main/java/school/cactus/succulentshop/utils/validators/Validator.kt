package school.cactus.succulentshop.utils.validators

interface Validator {
    fun validate(field: String): Int?
}