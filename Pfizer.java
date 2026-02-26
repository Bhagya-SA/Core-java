class Pfizer {

    static String companyName;
    static String ceo;
    static String foundedYear;
    static String headquarters;
    static String revenue;
    static String employees;
    static String products;
    static String stockSymbol;

    public static boolean getPropertiesInfo(String name, String ceoName, String year, String hq, String rev, String emp, String prod, String symbol) {

        boolean isPropertiesValidate = false;

        boolean isNameValidate = false;
        boolean isCeoValidate = false;
        boolean isFoundedYearValidate = false;
        boolean isHqValidate = false;
        boolean isRevenueValidate = false;
        boolean isEmployeesValidate = false;
        boolean isProductsValidate = false;
        boolean isSymbolValidate = false;

        if(name != null && !name.isEmpty()) { 
            System.out.println("Company Name validated"); 
            companyName = name; 
            isNameValidate = true; 
        } else { 
            System.out.println("Company Name not validated"); 
        }

        if(ceoName != null && !ceoName.isEmpty()) { 
            System.out.println("CEO validated"); 
            ceo = ceoName; 
            isCeoValidate = true; 
        } else { 
            System.out.println("CEO not validated"); 
        }

        if(year != null && !year.isEmpty()) { 
            System.out.println("Founded Year validated"); 
            foundedYear = year; 
            isFoundedYearValidate = true; 
        } else { 
            System.out.println("Founded Year not validated"); 
        }

        if(hq != null && !hq.isEmpty()) { 
            System.out.println("Headquarters validated"); 
            headquarters = hq; 
            isHqValidate = true; 
        } else { 
            System.out.println("Headquarters not validated"); 
        }

        if(rev != null && !rev.isEmpty()) { 
            System.out.println("Revenue validated"); 
            revenue = rev; 
            isRevenueValidate = true; 
        } else { 
            System.out.println("Revenue not validated"); 
        }

        if(emp != null && !emp.isEmpty()) { 
            System.out.println("Employees validated"); 
            employees = emp; 
            isEmployeesValidate = true; 
        } else { 
            System.out.println("Employees not validated"); 
        }

        if(prod != null && !prod.isEmpty()) { 
            System.out.println("Products validated"); 
            products = prod; 
            isProductsValidate = true; 
        } else { 
            System.out.println("Products not validated"); 
        }

        if(symbol != null && !symbol.isEmpty()) { 
            System.out.println("Stock Symbol validated"); 
            stockSymbol = symbol; 
            isSymbolValidate = true; 
        } else { 
            System.out.println("Stock Symbol not validated"); 
        }

        if(isNameValidate && isCeoValidate && isFoundedYearValidate && isHqValidate &&isRevenueValidate && isEmployeesValidate && isProductsValidate && isSymbolValidate) {
            isPropertiesValidate = true;
        }

        return isPropertiesValidate;
    }

    public static void displayInfo() {
        System.out.println("Company Name : " + companyName);
        System.out.println("CEO : " + ceo);
        System.out.println("Founded Year : " + foundedYear);
        System.out.println("Headquarters : " + headquarters);
        System.out.println("Revenue : " + revenue);
        System.out.println("Employees : " + employees);
        System.out.println("Products : " + products);
        System.out.println("Stock Symbol : " + stockSymbol);
    }

    
}