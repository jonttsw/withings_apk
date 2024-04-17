package com.withings.measure.detail.paged;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.paged.d;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.afib.f0;
import fn0.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.h;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: DatePagedActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/measure/detail/paged/DatePagedActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/measure/detail/paged/d$b;", "Lpy/a;", "<init>", "()V", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class DatePagedActivity extends WithingsActivity implements d.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f41697e = {v.c(DatePagedActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f41698a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f41699b;

    /* renamed from: c  reason: collision with root package name */
    private final d f41700c;

    /* renamed from: d  reason: collision with root package name */
    protected DateTime f41701d;

    /* compiled from: DatePagedActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<oy.a> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final oy.a invoke() {
            return oy.a.b(DatePagedActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: DatePagedActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measure.detail.paged.DatePagedActivity$onCreate$1", f = "DatePagedActivity.kt", l = {47}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41703a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DatePagedActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.measure.detail.paged.DatePagedActivity$onCreate$1$firstDate$1", f = "DatePagedActivity.kt", l = {47}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends i implements p<CoroutineScope, qm0.d<? super DateTime>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f41705a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DatePagedActivity f41706b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DatePagedActivity datePagedActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f41706b = datePagedActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f41706b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super DateTime> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f41705a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    this.f41705a = 1;
                    obj = this.f41706b.C3(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41703a;
            DatePagedActivity datePagedActivity = DatePagedActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(datePagedActivity, null);
                this.f41703a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            k<Object>[] kVarArr = DatePagedActivity.f41697e;
            m0 m11 = datePagedActivity.getSupportFragmentManager().m();
            m11.l(datePagedActivity.A3().f90073c.getId(), datePagedActivity.z3((DateTime) obj), null);
            m11.f();
            return y.f85009a;
        }
    }

    /* compiled from: DatePagedActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<ProgressBar> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) DatePagedActivity.this.findViewById(C1987R.id.progressBar);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41708a = h.b(new com.withings.measure.detail.paged.b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f41709b;

        public d(Activity activity) {
            this.f41709b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f41708a.getValue();
        }
    }

    public DatePagedActivity() {
        super(C1987R.layout.activity_date_paged_data);
        this.f41698a = h.b(new a());
        this.f41699b = h.b(new c());
        this.f41700c = new d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final oy.a A3() {
        return (oy.a) this.f41698a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DateTime B3() {
        DateTime dateTime = this.f41701d;
        if (dateTime != null) {
            return dateTime;
        }
        u.s("dateTime");
        throw null;
    }

    public abstract Object C3(qm0.d<? super DateTime> dVar);

    public final void D3(boolean z5) {
        ProgressBar progressBar;
        int i11;
        nm0.g gVar = this.f41699b;
        if (z5) {
            Object value = gVar.getValue();
            u.i(value, "getValue(...)");
            progressBar = (ProgressBar) value;
            i11 = 0;
        } else {
            Object value2 = gVar.getValue();
            u.i(value2, "getValue(...)");
            progressBar = (ProgressBar) value2;
            i11 = 8;
        }
        progressBar.setVisibility(i11);
    }

    @Override // com.withings.measure.detail.paged.d.b
    public final void Y(com.withings.measure.detail.paged.d fragment, DateTime dateTime) {
        u.j(fragment, "fragment");
        u.j(dateTime, "dateTime");
        this.f41701d = dateTime;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final User getUser() {
        return (User) this.f41700c.getValue(this, f41697e[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        setContentView(A3().a());
        setSupportActionBar(A3().f90074d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = com.withings.measure.detail.paged.a.a(intent);
        } else {
            Serializable serializableExtra = intent.getSerializableExtra("date");
            if (!(serializableExtra instanceof DateTime)) {
                serializableExtra = null;
            }
            obj = (DateTime) serializableExtra;
        }
        u.g(obj);
        this.f41701d = (DateTime) obj;
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new b(null), 3, null);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            if (onSupportNavigateUp()) {
                return true;
            }
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public abstract f0 z3(DateTime dateTime);
}
