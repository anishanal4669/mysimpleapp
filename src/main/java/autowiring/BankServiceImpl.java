package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bankService")
public class BankServiceImpl  {

//
//    private BankRepository repository;
//
//    @Autowired
//    public BankServiceImpl(BankRepository repository){
//        this.repository = repository;
//    }
//
//    @Override
//    public void depositIntoAccount(int accountId, double amount) {
//        System.out.printf("In BankServicempl.depositIntoAccount(%d, %.2f)\n", accountId, amount);
//        repository.updateBalance(accountId, amount);
//    }
//
//    @Override
//    public void withdrawFromAccount(int accountId, double amount) {
//        System.out.printf("In BankServicempl.withdrawFromAccount(%d, %.2f)\n", accountId, amount);
//        repository.updateBalance(accountId, -amount);
//    }
//
////    @Override
////    public void transferFunds(int fromAccountId, int toAccountId, double amount) {
////        System.out.printf("In BankServicempl.withdrawFromAccount(%d, %.2f)\n", accountId, amount);
////        repository.updateBalance(accountId, amount);
////    }
}
