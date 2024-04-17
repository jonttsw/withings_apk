package com.withings.wiscale2;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: ShareWithMyDoctor.kt */
/* loaded from: classes4.dex */
public final class t2 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final User f61723a;

    /* renamed from: b  reason: collision with root package name */
    private final fy.l f61724b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.k0<DateTime> f61725c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61726d;

    /* compiled from: ShareWithMyDoctor.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<List<MeasuresGroup>, LiveData<p2>> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<p2> invoke(List<MeasuresGroup> list) {
            List<MeasuresGroup> list2 = list;
            kotlin.jvm.internal.u.j(list2, "list");
            t2 t2Var = t2.this;
            return androidx.lifecycle.h.a(androidx.lifecycle.h1.a(t2Var).getCoroutineContext().plus(Dispatchers.getIO()), new s2(t2Var, list2, null), 2);
        }
    }

    /* compiled from: ShareWithMyDoctor.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<DateTime, LiveData<List<MeasuresGroup>>> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<MeasuresGroup>> invoke(DateTime dateTime) {
            t2 t2Var = t2.this;
            return androidx.lifecycle.h.a(androidx.lifecycle.h1.a(t2Var).getCoroutineContext().plus(Dispatchers.getIO()), new w2(dateTime, t2Var, null), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Application application, User user, fy.l lVar) {
        super(application);
        kotlin.jvm.internal.u.j(user, "user");
        this.f61723a = user;
        this.f61724b = lVar;
        androidx.lifecycle.k0<DateTime> k0Var = new androidx.lifecycle.k0<>();
        this.f61725c = k0Var;
        this.f61726d = androidx.lifecycle.e1.c(androidx.lifecycle.e1.c(k0Var, new b()), new a());
    }

    public final androidx.lifecycle.j0 f0() {
        return this.f61726d;
    }

    public final fy.l g0() {
        return this.f61724b;
    }

    public final User getUser() {
        return this.f61723a;
    }

    public final androidx.lifecycle.k0<DateTime> i0() {
        return this.f61725c;
    }
}
