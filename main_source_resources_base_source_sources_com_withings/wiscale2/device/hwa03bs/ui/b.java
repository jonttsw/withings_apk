package com.withings.wiscale2.device.hwa03bs.ui;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: Hwa03LottieResources.kt */
/* loaded from: classes5.dex */
public final class b {
    public static final String a(String str) {
        if (str == null) {
            return "hwa03_36_json";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1719376794) {
            if (hashCode != -1700093808) {
                if (hashCode != 2131280910 || !str.equals(ConstantsWs.DEVICE_COLOR_HR40_BLACK)) {
                    return "hwa03_36_json";
                }
            } else if (!str.equals(ConstantsWs.DEVICE_COLOR_SPORT_WHITE)) {
                return "hwa03_36_json";
            }
        } else if (!str.equals(ConstantsWs.DEVICE_COLOR_SPORT_BLACK)) {
            return "hwa03_36_json";
        }
        return "hwa03_40_json";
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(java.lang.String r2) {
        /*
            java.lang.String r0 = "lottie/hwa03bs_black"
            if (r2 == 0) goto L8c
            int r1 = r2.hashCode()
            switch(r1) {
                case -1719376794: goto L86;
                case -1700093808: goto L7a;
                case -1331732797: goto L6e;
                case -1283334401: goto L65;
                case -1129247900: goto L59;
                case -1082776099: goto L50;
                case 73002229: goto L44;
                case 92285215: goto L38;
                case 788310571: goto L2f;
                case 1653296521: goto L25;
                case 2035252644: goto L1b;
                case 2131280910: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L8c
        Ld:
            java.lang.String r1 = "40mm-black"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L17
            goto L8c
        L17:
            java.lang.String r0 = "lottie/40mm_black-silver"
            goto L8c
        L1b:
            java.lang.String r1 = "gold-red"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L77
            goto L8c
        L25:
            java.lang.String r1 = "gold-brown"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L77
            goto L8c
        L2f:
            java.lang.String r1 = "36mm-black-r.gold-s.black"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L62
            goto L8c
        L38:
            java.lang.String r1 = "36mm-white"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L41
            goto L8c
        L41:
            java.lang.String r0 = "lottie/silver-white"
            goto L8c
        L44:
            java.lang.String r1 = "36mm-black"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L4d
            goto L8c
        L4d:
            java.lang.String r0 = "lottie/silver-black"
            goto L8c
        L50:
            java.lang.String r1 = "36mm-white-r.gold-s.grey"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L77
            goto L8c
        L59:
            java.lang.String r1 = "36mm-black-r.gold-l.black"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L62
            goto L8c
        L62:
            java.lang.String r0 = "lottie/rosegold-black-leather"
            goto L8c
        L65:
            java.lang.String r1 = "36mm-white-r.gold-l.blue"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L77
            goto L8c
        L6e:
            java.lang.String r1 = "gold-pink"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L77
            goto L8c
        L77:
            java.lang.String r0 = "lottie/rosegold-blueband"
            goto L8c
        L7a:
            java.lang.String r1 = "sport-white"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L83
            goto L8c
        L83:
            java.lang.String r0 = "lottie/hwa03bs_white"
            goto L8c
        L86:
            java.lang.String r1 = "sport-black"
            boolean r2 = r2.equals(r1)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.hwa03bs.ui.b.b(java.lang.String):java.lang.String");
    }

    public static DateTime c(List measuresGroup, DateTime dateTime) {
        DateTime withMonthOfYear;
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        if (!dateTime.plusYears(19).isAfterNow()) {
            if (measuresGroup.isEmpty()) {
                withMonthOfYear = DateTime.now();
            } else {
                withMonthOfYear = ((ky.d) measuresGroup.get(0)).c().withDayOfMonth(1).withMonthOfYear(1);
            }
            dateTime = withMonthOfYear;
            kotlin.jvm.internal.u.g(dateTime);
        }
        return dateTime;
    }
}
