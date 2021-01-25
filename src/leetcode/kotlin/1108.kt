/*
 * 1108. Defanging an IP Address
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
fun defangIPaddr(address: String): String {
    return address.replace(".", "[.]")
}
