package com.withings.common.device;

import android.util.Base64;
import androidx.compose.runtime.a;
import com.withings.scalesmodes.core.ScalesModes;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Random;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.util.StringUtils;
/* compiled from: MacAddressObfuscator.kt */
/* loaded from: classes3.dex */
public final class s implements w8.a {
    public static String a() {
        char[] charArray = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < 32; i11++) {
            sb2.append(charArray[random.nextInt(charArray.length)]);
        }
        return sb2.toString();
    }

    public static String b(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 0).replaceAll("\n", "");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    public static String d(String str) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(StringUtils.MD5).digest(str.getBytes("UTF-8")), 0).replaceAll("\n", "");
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    public static final String e(String stringToHash) {
        u.j(stringToHash, "stringToHash");
        String str = "Withings2014!" + stringToHash + "AppTracking";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(StringUtils.MD5);
            byte[] bytes = str.getBytes(dp0.c.f64094b);
            u.i(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            u.g(digest);
            for (byte b10 : digest) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(b10 & 255));
                while (sb3.length() < 2) {
                    sb3.insert(0, "0");
                }
                sb2.append((CharSequence) sb3);
            }
            String sb4 = sb2.toString();
            u.i(sb4, "toString(...)");
            return sb4;
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static final boolean f(ScalesModes scalesModes) {
        u.j(scalesModes, "<this>");
        int ordinal = scalesModes.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return true;
        }
        return false;
    }

    public static final pa.q g(Integer num, Integer num2, String[] strArr, androidx.compose.runtime.a aVar) {
        aVar.s(1613443783);
        aVar.s(-3686930);
        boolean K = aVar.K(strArr);
        Object t11 = aVar.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new ra.d((String[]) Arrays.copyOf(strArr, strArr.length));
            aVar.n(t11);
        }
        aVar.J();
        ra.d dVar = (ra.d) t11;
        aVar.s(-3686095);
        boolean K2 = aVar.K(dVar) | aVar.K(num) | aVar.K(num2);
        Object t12 = aVar.t();
        if (K2 || t12 == a.C0060a.a()) {
            t12 = new pa.q(num, dVar, num2);
            aVar.n(t12);
        }
        aVar.J();
        pa.q qVar = (pa.q) t12;
        aVar.J();
        return qVar;
    }
}
