package school.cactus.succulentshop.utils.validators.signup

import school.cactus.succulentshop.R
import school.cactus.succulentshop.utils.extensions.*
import school.cactus.succulentshop.utils.validators.Validator


class PasswordValidator : Validator {

    override fun validate(field: String) = when {
        field.isEmpty() -> R.string.password_is_required
        !field.isLonger(7) -> R.string.password_is_too_short
        !field.isShorter(40) -> R.string.password_is_too_long
        !field.containsDigit() -> R.string.must_contain_character_err_message
        !field.containsLowerCase() -> R.string.must_contain_character_err_message
        !field.containsUpperCase() -> R.string.must_contain_character_err_message
        !field.containsSpecialCharacter() -> R.string.must_contain_character_err_message
        else -> null
    }

}