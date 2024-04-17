package com.withings.webservices.legacy.sync;
/* loaded from: classes4.dex */
public interface SyncJobStatePrinter {

    /* loaded from: classes4.dex */
    public static class Helper {
        public static String durationMillis(long j5) {
            return ah.a.c(" in ", j5, " millis");
        }

        public static String state(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return "UNKNOWN";
                            }
                            return "SKIPPED";
                        }
                        return "FAILED";
                    }
                    return "SUCCESS";
                }
                return "RUNNING";
            }
            return "PENDING";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String tree(int i11) {
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < i11 - 1; i12++) {
                sb2.append("| ");
            }
            if (i11 > 0) {
                sb2.append("+-");
            }
            return sb2.toString();
        }
    }

    void print(String str);
}
