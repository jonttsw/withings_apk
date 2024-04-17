package com.withings.wiscale2.heart.afib;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import com.withings.user.User;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: AFibMeasuresListActivity.kt */
/* loaded from: classes5.dex */
public final class v extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f57254a;

    /* renamed from: b  reason: collision with root package name */
    private final fy.o f57255b;

    /* renamed from: c  reason: collision with root package name */
    private final User f57256c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57257d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f57258e;

    /* renamed from: f  reason: collision with root package name */
    private final long f57259f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.j0 f57260g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f57261h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f57262i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57263j;

    /* compiled from: AFibMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<List<ky.d>>> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<ky.d>> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new u(v.this, null), 2);
        }
    }

    public v(long j5, fy.o oVar, User user, boolean z5) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f57254a = j5;
        this.f57255b = oVar;
        this.f57256c = user;
        this.f57257d = z5;
        androidx.lifecycle.k0<Boolean> k0Var = new androidx.lifecycle.k0<>(Boolean.TRUE);
        this.f57258e = k0Var;
        this.f57259f = hn.a.q(new DateTime(j5)).plusMonths(1).minus(1L).getMillis();
        this.f57260g = e1.c(k0Var, new a());
        this.f57261h = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.wiscale2.heart.afib.v r11, boolean r12, boolean r13, boolean r14, qm0.d r15) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.v.f0(com.withings.wiscale2.heart.afib.v, boolean, boolean, boolean, qm0.d):java.lang.Object");
    }

    public final androidx.lifecycle.j0 k0() {
        return this.f57260g;
    }

    public final void m0(boolean z5, boolean z11, boolean z12) {
        this.f57261h = z5;
        this.f57262i = z11;
        this.f57263j = z12;
        this.f57258e.postValue(Boolean.TRUE);
    }
}
