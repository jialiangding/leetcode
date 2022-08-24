public class DoContact {

    private final int age;
    private final int safeID;
    private final String name;
    private final String address;

    public int getAge() {
        return age;
    }
    public int getSafeID() {
        return safeID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "DoContact{" +
                "age=" + age +
                ", safeID=" + safeID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private int age = 0;
        private int safeID = 0;
        private String name = null;
        private String address = null;

        // 构建的步骤
        public Builder(String name) {
            this.name = name;
        }
        public Builder age(int val) {
            this.age = val;
            return this;
        }
        public Builder safeID(int val) {
            this.safeID = val;
            return this;
        }
        public Builder address(String val) {
            this.address = val;
            return this;
        }
        // 构建，返回一个新对象
        public DoContact build() {
            return new DoContact(this);
        }
    }

    private DoContact(Builder b) {
        age = b.age;
        safeID = b.safeID;
        name = b.name;
        address = b.address;
    }

    public static void main(String[] args) {
        DoContact doContact=new Builder("name").age(18).build();
        System.out.println(doContact.toString());


    }
}
