package com.gmail.venderser.lesson5.homeWork;

 class Services {
    public void year(int firstYear, int lastYear) {
        int summ = 0;
        for (int i = firstYear; i <= lastYear; i++) {
            if (i % 400 == 0) {
                summ += 366;
            } else {
                if (i % 4 == 0 & i % 100 != 0) {
                    summ += 366;
                } else {
                    summ += 365;
                }
            }
        }
        sysOut(summ);//bug fixer
    }

    public void quad(int fistN, int lastN) {
        for (int i = fistN; i <= lastN; i++) {
            sysOut(i * i);
        }
    }

    public void mathmath(int fistN, int lastN) {
        for (int i = fistN; i <= lastN; i++) {
            if (i % 5 != 0 & i % 3 == 0) {
                sysOut(i);
            }
        }
    }


    private void sysOut(int x) {
        System.out.println(x);
    }
}
