package com.gmail.venderser.lesson5.homeWork.addTasks;
//I didn`t indicate access modifiers cause i need get access only in this package (friendly modifier)

class Services {

    int[] massGenerator(int n) {
        int massive[] = new int[n];
        for (int i = 0; i < n; i++) {
            massive[i] = i + 1;
            //     sysOut(massive[i]);//bugFixer
        }
        return massive;
    }

    void percent(int x[], int n) {
        for (int i = 0; i < n; i++) {
            float mass = x[i];
            sysOutD(mass * 1.1F);
        }


    }

    void numberHunter(int massive[], int n, int x) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (massive[i] == x) {
                j = i;
            }
        }
        if (j != 0) {
            int firstSumm = 0;
            int secondSumm = 0;
            for (int i = 0; i < j; i++) {
                firstSumm += massive[i];
            }
            sysOut(firstSumm);
            for (int i = j + 1; i < n; i++) {
                secondSumm += massive[i];
            }
            sysOut(secondSumm);
        } else {
            System.out.println("NO");

        }
    }

    void secondMaximum(int massive[], int n) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < n; i++) {
            if (massive[i] > max) {
                secondMax = max;
                max = massive[i];
            }
        }
        sysOut(secondMax);
    }

    void noNamedMethod(int firstMass[], int secondMass[], int n) {
        int min = firstMass[0];
        int j=0;
        for(int i=1;i<n;i++){
            if (firstMass[i]<min){
                min=firstMass[i];
                j=i;
            }
        }
        sysOut(secondMass[j]);
    }

    private void sysOut(int x) {
        System.out.println(x);

    }

    private void sysOutD(float x) {
        System.out.println(x);

    }
}
