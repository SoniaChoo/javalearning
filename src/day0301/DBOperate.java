interface UserInfoDao {
    publiv void add(User user) {
        public void add(User user);
        public void delete(User user);
    }
}

class UserInfoByJDBC implements UserInfoDao {
    public void add(User user) {

    }

    public void delete(User user) {

    }
}

class UserInfoByHibernate implements UserInfoDao {
    public void add(User user) {

    }
    public void delete(User user) {

    }
}

class DBOperate {
    public static void main(String[] args) {
        UserInfoByHibernate ui = new UserInfoByHibernate();
        UserInfoDao ui = new UserInfoByHibernate();
        ui.add(user);
        ui.delete(user);
    }
}
