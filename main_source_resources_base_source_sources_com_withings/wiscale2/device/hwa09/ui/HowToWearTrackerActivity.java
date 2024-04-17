package com.withings.wiscale2.device.hwa09.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.android.activity.WithingsActivity;
import com.withings.authentication.n;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: HowToWearTrackerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/hwa09/ui/HowToWearTrackerActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HowToWearTrackerActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f54536a = 0;

    /* compiled from: HowToWearTrackerActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, long j5) {
            Intent putExtra = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, HowToWearTrackerActivity.class).putExtra("extra_device_id", j5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: HowToWearTrackerActivity.kt */
    @e(c = "com.withings.wiscale2.device.hwa09.ui.HowToWearTrackerActivity$onCreate$1", f = "HowToWearTrackerActivity.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54537a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ tb0.y f54538b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HowToWearTrackerActivity f54539c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HowToWearTrackerActivity.kt */
        @e(c = "com.withings.wiscale2.device.hwa09.ui.HowToWearTrackerActivity$onCreate$1$device$1", f = "HowToWearTrackerActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends i implements p<CoroutineScope, d<? super Device>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ HowToWearTrackerActivity f54540a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HowToWearTrackerActivity howToWearTrackerActivity, d<? super a> dVar) {
                super(2, dVar);
                this.f54540a = howToWearTrackerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                return new a(this.f54540a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super Device> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                return kn.e.c().d(this.f54540a.getIntent().getLongExtra("extra_device_id", 0L));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(tb0.y yVar, HowToWearTrackerActivity howToWearTrackerActivity, d<? super b> dVar) {
            super(2, dVar);
            this.f54538b = yVar;
            this.f54539c = howToWearTrackerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(this.f54538b, this.f54539c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f54537a;
            HowToWearTrackerActivity howToWearTrackerActivity = this.f54539c;
            if (i12 != 0) {
                if (i12 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(howToWearTrackerActivity, null);
                this.f54537a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Device device = (Device) obj;
            int modelId = device.getModelId();
            tb0.y yVar = this.f54538b;
            if (modelId != 94) {
                if (modelId != 95) {
                    ImageView imageView = yVar.f99635b;
                    if (device.getTrackerWearPosition() == 0) {
                        i11 = 2131232497;
                    } else {
                        i11 = 2131232281;
                    }
                    imageView.setImageResource(i11);
                } else {
                    yVar.f99637d.setText(howToWearTrackerActivity.getString(C1987R.string.hwa11Installation_positionWrist_title));
                    yVar.f99636c.setText(howToWearTrackerActivity.getString(C1987R.string.hwa11Installation_positionWrist_description));
                    yVar.f99635b.setImageResource(2131231098);
                }
            } else {
                yVar.f99637d.setText(howToWearTrackerActivity.getString(C1987R.string.hwa10Installation_positionWrist_title));
                yVar.f99636c.setText(howToWearTrackerActivity.getString(C1987R.string.hwa10Installation_positionWrist_description));
                if (device.getTrackerWearPosition() == 0) {
                    yVar.f99635b.setImageResource(2131231099);
                } else {
                    yVar.f99635b.setImageResource(2131231098);
                }
            }
            return y.f85009a;
        }
    }

    public HowToWearTrackerActivity() {
        super(C1987R.layout.activity_how_to_wear_hwa09);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tb0.y b10 = tb0.y.b(getLayoutInflater());
        setContentView(b10.a());
        ConstraintLayout a11 = b10.a();
        u.i(a11, "getRoot(...)");
        ay.b.t(a11);
        ConstraintLayout a12 = b10.a();
        u.i(a12, "getRoot(...)");
        ay.b.n(a12, true, true, 21);
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new b(b10, this, null), 2, null);
        b10.f99638e.setOnClickListener(new sg.d(this, 9));
    }
}
