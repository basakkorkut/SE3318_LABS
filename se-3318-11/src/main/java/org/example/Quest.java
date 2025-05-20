package org.example;
//DesignForExtension // ✔ FIXED: Parameter declared as final
public final  class  Quest {
    //  Parameters made final
    public boolean completeQuest(final int points, final boolean isRingBearer) {
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        return (points >= 100) ? true : false;
    }
}