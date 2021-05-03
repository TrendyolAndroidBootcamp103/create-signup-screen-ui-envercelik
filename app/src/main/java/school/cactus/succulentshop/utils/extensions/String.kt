package school.cactus.succulentshop.utils.extensions

fun String.containsDigit() = any { it.isDigit() }

fun String.containsLowerCase() = any { it.isLowerCase() }

fun String.containsUpperCase() = any { it.isUpperCase() }

fun String.containsSpecialCharacter() = any { it.isSpecialCharacter() }

fun Char.isSpecialCharacter() = !isDigit() && !isLetter()

fun String.isLonger(minLength: Int) = length > minLength

fun String.isShorter(maxLength: Int) = length < maxLength

fun String.containsValidCharacters() = all {
    it.isLowerCase() || it.isDigit() || it == '_'
}

