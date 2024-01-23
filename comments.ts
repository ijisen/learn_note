/**
 * Restful 接口文档规范
 */
/**
 * 注释 规范
 *
 * @param name    The enum type whose constant is to be returned
 * @param enumType    the {@code Class} object of the enum type from which to return a constant
 * @return boolean the enum constant of the specified enum type with the specified name
 * @throws IllegalArgumentException if the specified enum type has
 *         no constant with the specified name, or the specified
 *         class object does not represent an enum type
 * @throws NullPointerException if {@code enumType} or {@code name}
 *         is null
 * @since 1.5
 * @author 1.5
 * @see        java.lang.Integer#toString(int)
 */
const getName = (name: string, enumType: string) => {
    if (name) {
        return true
    }
    return false
}
