package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.LinearLayoutManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.ui.s1;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: MedicalFeatureListActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/MedicalFeatureListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/common/ui/s1$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MedicalFeatureListActivity extends Hilt_MedicalFeatureListActivity implements s1.a {

    /* renamed from: e  reason: collision with root package name */
    private final d f53724e;

    /* renamed from: f  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f53725f;

    /* renamed from: g  reason: collision with root package name */
    private x1 f53726g;

    /* renamed from: h  reason: collision with root package name */
    private v1 f53727h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public y1 f53728i;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53723k = {androidx.camera.core.v.c(MedicalFeatureListActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(MedicalFeatureListActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityMedicalFeatureListBinding;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f53722j = new Object();

    /* compiled from: MedicalFeatureListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            Intent intent = new Intent(context, MedicalFeatureListActivity.class);
            intent.putExtra("device", device);
            return intent;
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class b implements k1.b {
        public b() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            MedicalFeatureListActivity medicalFeatureListActivity = MedicalFeatureListActivity.this;
            y1 y1Var = medicalFeatureListActivity.f53728i;
            if (y1Var != null) {
                return y1Var.a(MedicalFeatureListActivity.B3(medicalFeatureListActivity));
            }
            kotlin.jvm.internal.u.s("viewModelFactory");
            throw null;
        }
    }

    /* compiled from: MedicalFeatureListActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.MedicalFeatureListActivity$onCreate$2$1", f = "MedicalFeatureListActivity.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x1 f53731b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MedicalFeatureListActivity f53732c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MedicalFeatureListActivity.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MedicalFeatureListActivity f53733a;

            a(MedicalFeatureListActivity medicalFeatureListActivity) {
                this.f53733a = medicalFeatureListActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                int i11;
                MedicalFeatureListActivity medicalFeatureListActivity = this.f53733a;
                ArrayList a11 = new b2(MedicalFeatureListActivity.B3(medicalFeatureListActivity).getId()).a((List) obj);
                v1 v1Var = medicalFeatureListActivity.f53727h;
                if (v1Var != null) {
                    v1Var.submitList(a11);
                    TextView noMedicalTag = medicalFeatureListActivity.C3().f99055b;
                    kotlin.jvm.internal.u.i(noMedicalTag, "noMedicalTag");
                    if (a11.isEmpty()) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    noMedicalTag.setVisibility(i11);
                    return nm0.y.f85009a;
                }
                kotlin.jvm.internal.u.s("adapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x1 x1Var, MedicalFeatureListActivity medicalFeatureListActivity, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f53731b = x1Var;
            this.f53732c = medicalFeatureListActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f53731b, this.f53732c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53730a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                SharedFlow<List<PlatformFeature>> i02 = this.f53731b.i0();
                a aVar = new a(this.f53732c);
                this.f53730a = 1;
                if (i02.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53734a = nm0.h.b(new t1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53735b;

        public d(Activity activity) {
            this.f53735b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53734a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.f0> {
        @Override // ym0.l
        public final tb0.f0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.f0.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public MedicalFeatureListActivity() {
        super(0);
        this.f53724e = new d(this);
        this.f53725f = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
    }

    public static final Device B3(MedicalFeatureListActivity medicalFeatureListActivity) {
        return (Device) medicalFeatureListActivity.f53724e.getValue(medicalFeatureListActivity, f53723k[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.f0 C3() {
        Object value = ((LifecycleViewBindingProperty) this.f53725f).getValue(this, f53723k[1]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.f0) value;
    }

    @Override // com.withings.wiscale2.device.common.ui.s1.a
    public final void b3(int i11, boolean z5) {
        x1 x1Var = this.f53726g;
        if (x1Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(x1Var), Dispatchers.getIO(), null, new w1(x1Var, i11, z5, null), 2, null);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.common.ui.Hilt_MedicalFeatureListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.o(true);
            supportActionBar.q(true);
        }
        tb0.f0 C3 = C3();
        C3.f99054a.setLayoutManager(new LinearLayoutManager(1));
        this.f53727h = new v1(this);
        tb0.f0 C32 = C3();
        v1 v1Var = this.f53727h;
        if (v1Var != null) {
            C32.f99054a.setAdapter(v1Var);
            x1 x1Var = (x1) new androidx.lifecycle.k1(this, new b()).a(x1.class);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(x1Var), null, null, new c(x1Var, this, null), 3, null);
            this.f53726g = x1Var;
            return;
        }
        kotlin.jvm.internal.u.s("adapter");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
