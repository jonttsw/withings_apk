package com.withings.wiscale2.measure.list;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureListActivity.kt */
/* loaded from: classes5.dex */
public final class g extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final Application f58541a;

    /* renamed from: b  reason: collision with root package name */
    private final m70.i f58542b;

    /* renamed from: c  reason: collision with root package name */
    private final fy.n f58543c;

    /* renamed from: d  reason: collision with root package name */
    private final long f58544d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f58545e;

    /* renamed from: f  reason: collision with root package name */
    private final fy.a f58546f;

    /* renamed from: g  reason: collision with root package name */
    private final k0<Boolean> f58547g;

    /* renamed from: h  reason: collision with root package name */
    private final j0 f58548h;

    /* renamed from: i  reason: collision with root package name */
    private final i f58549i;

    /* renamed from: j  reason: collision with root package name */
    private final j0 f58550j;

    /* compiled from: MeasureListActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<User, LiveData<List<d>>> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<d>> invoke(User user) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new f(g.this, user, null), 2);
        }
    }

    /* compiled from: MeasureListActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<User>> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<User> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new h(g.this, null), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Application application, m70.i iVar, fy.n nVar, long j5, int[] measureTypes, fy.a aVar) {
        super(application);
        kotlin.jvm.internal.u.j(measureTypes, "measureTypes");
        this.f58541a = application;
        this.f58542b = iVar;
        this.f58543c = nVar;
        this.f58544d = j5;
        this.f58545e = measureTypes;
        this.f58546f = aVar;
        k0<Boolean> b10 = xw.d.b(Boolean.TRUE);
        this.f58547g = b10;
        j0 c11 = e1.c(b10, new b());
        this.f58548h = c11;
        this.f58549i = ah.d.e(measureTypes);
        this.f58550j = e1.c(c11, new a());
    }

    public static final String i0(g gVar, MeasuresGroup measuresGroup) {
        gVar.getClass();
        return b50.b.n(gVar.f58541a, new DateTime(measuresGroup.getDate().getTime()));
    }

    public final fy.n j0() {
        return this.f58543c;
    }

    public final j0 k0() {
        return this.f58550j;
    }

    public final int[] m0() {
        return this.f58545e;
    }

    public final k0<Boolean> p0() {
        return this.f58547g;
    }

    public final j0 q0() {
        return this.f58548h;
    }

    public final long r0() {
        return this.f58544d;
    }

    public final m70.i t0() {
        return this.f58542b;
    }
}
