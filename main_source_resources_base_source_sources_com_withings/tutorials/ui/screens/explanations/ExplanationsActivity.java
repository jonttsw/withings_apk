package com.withings.tutorials.ui.screens.explanations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.k1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.core.model.ExplanationsType;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
/* compiled from: ExplanationsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/tutorials/ui/screens/explanations/ExplanationsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ExplanationsActivity extends Hilt_ExplanationsActivity {

    /* renamed from: e  reason: collision with root package name */
    private final c f45080e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final d f45081f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private final e f45082g = new e(this);

    /* renamed from: h  reason: collision with root package name */
    private final androidx.lifecycle.i1 f45083h = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(ExplanationsViewModel.class), new g(this), new f(this), new h(this));

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f45079j = {androidx.camera.core.v.c(ExplanationsActivity.class, "explanationsType", "getExplanationsType()Lcom/withings/tutorials/core/model/ExplanationsType;", 0), androidx.camera.core.v.c(ExplanationsActivity.class, "userID", "getUserID()J", 0), androidx.camera.core.v.c(ExplanationsActivity.class, "shouldAllowBack", "getShouldAllowBack()Z", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f45078i = new Object();

    /* compiled from: ExplanationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, ExplanationsType explanationsType, long j5) {
            Intent putExtra = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, ExplanationsActivity.class).putExtra("EXTRA_KEY_EXPLANATIONS_IDENTIFIER", explanationsType).putExtra("EXTRA_KEY_USER_ID", j5).putExtra("EXTRA_KEY_ALLOW_BACK", true);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: ExplanationsActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -2074446160, new t(ExplanationsActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, ExplanationsType> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f45085a = nm0.h.b(new u(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f45086b;

        public c(Activity activity) {
            this.f45086b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.tutorials.core.model.ExplanationsType] */
        @Override // bn0.d
        public final ExplanationsType getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f45085a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f45087a = nm0.h.b(new v(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f45088b;

        public d(Activity activity) {
            this.f45088b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f45087a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f45089a = nm0.h.b(new w(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f45090b;

        public e(Activity activity) {
            this.f45090b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f45089a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45091a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f45091a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f45091a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45092a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f45092a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f45092a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45093a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f45093a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f45093a.getDefaultViewModelCreationExtras();
        }
    }

    public static final boolean A3(ExplanationsActivity explanationsActivity) {
        return ((Boolean) explanationsActivity.f45082g.getValue(explanationsActivity, f45079j[2])).booleanValue();
    }

    public static final void B3(ExplanationsActivity explanationsActivity) {
        ExplanationsViewModel explanationsViewModel = (ExplanationsViewModel) explanationsActivity.f45083h.getValue();
        fn0.k<Object>[] kVarArr = f45079j;
        ExplanationsType explanationsType = (ExplanationsType) explanationsActivity.f45080e.getValue(explanationsActivity, kVarArr[0]);
        long longValue = ((Number) explanationsActivity.f45081f.getValue(explanationsActivity, kVarArr[1])).longValue();
        kotlin.jvm.internal.u.j(explanationsType, "explanationsType");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new y(explanationsViewModel, explanationsType, longValue, null), 3, null);
        explanationsActivity.finish();
    }

    public static final ExplanationsType z3(ExplanationsActivity explanationsActivity) {
        explanationsActivity.getClass();
        return (ExplanationsType) explanationsActivity.f45080e.getValue(explanationsActivity, f45079j[0]);
    }

    @Override // com.withings.tutorials.ui.screens.explanations.Hilt_ExplanationsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        e.k.a(this, new s1.a(true, -1360578294, new b()));
    }
}
