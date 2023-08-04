public class AddressManager {
    public static void addAddress(User user, Address address) {
        user.getAddressList().add(address);
    }
}
