package com.withings.wiscale2.account.password;

import com.withings.wiscale2.C1987R;
import fk.t;
import java.util.Collection;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: PasswordValidator.kt */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static final dp0.h f48179b = new dp0.h(".*[0-9].*");

    /* renamed from: c  reason: collision with root package name */
    private static final dp0.h f48180c = new dp0.h(".*[A-Z].*");

    /* renamed from: d  reason: collision with root package name */
    private static final dp0.h f48181d = new dp0.h(".*[a-z].*");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f48182a;

    public r(List<String> list) {
        this.f48182a = list;
    }

    public static List a(String password) {
        boolean z5;
        u.j(password, "password");
        t[] tVarArr = new t[4];
        if (password.length() >= 12) {
            z5 = true;
        } else {
            z5 = false;
        }
        tVarArr[0] = new t(C1987R.string.settings_account_password_requirements_atLeast12charac, z5);
        tVarArr[1] = new t(C1987R.string.settings_account_password_requirements_atLeast1Number, f48179b.c(password));
        tVarArr[2] = new t(C1987R.string.settings_account_password_requirements_atLeast1UppCase, f48180c.c(password));
        tVarArr[3] = new t(C1987R.string.settings_account_password_requirements_atLeast1LowCase, f48181d.c(password));
        return x.W(tVarArr);
    }

    public final boolean b(String password) {
        u.j(password, "password");
        if (password.length() > 0) {
            List<String> list = this.f48182a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    if (u.e(str, password)) {
                        break;
                    }
                }
            }
            List<t> a11 = a(password);
            if (!(a11 instanceof Collection) || !a11.isEmpty()) {
                for (t tVar : a11) {
                    if (!tVar.b()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
