package repositoryImpl;

import java.util.List;

import domain.AccountBean;
import repository.AccountDAO;
import repository.MemberDAO;

public class AccountDAOImpl implements AccountDAO {
	private static AccountDAO instance = new AccountDAOImpl();
	public static AccountDAO getInstance() {return instance;}
	public AccountDAOImpl() {}

	@Override
	public void insertAccount(AccountBean account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountBean> selectAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> selectAccountByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean selectAccountById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateAccount(AccountBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(AccountBean member) {
		// TODO Auto-generated method stub
		
	}

}
