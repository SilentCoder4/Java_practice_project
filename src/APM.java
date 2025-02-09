//WAP to create a packege that acess the member of external class as well as same packege.
package src;

import myPackage.ExternalClass;
import myPackage.SamePackageClass;

public class APM {
    public static void main(String[] args) {

        ExternalClass externalObj = new ExternalClass();
        externalObj.showMessage();

        SamePackageClass samePackageObj = new SamePackageClass();
        samePackageObj.displayMessage();
    }
}
