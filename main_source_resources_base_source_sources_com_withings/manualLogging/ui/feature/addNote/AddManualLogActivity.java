package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.common.LogType;
import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: AddManualLogActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/AddManualLogActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "Lfx/e;", "noteGroup", "Lcom/withings/manualLogging/ui/uikit/atoms/SaveManualLogButtonStatus;", "saveButtonSituation", "", "Lfx/c;", "medicines", "Lfx/f;", "symptoms", "", "currentPatientId", "newPatientId", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddManualLogActivity extends Hilt_AddManualLogActivity {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f40697k = 0;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f40698e = nm0.h.b(new e());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f40699f = nm0.h.b(new f());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f40700g = nm0.h.b(new d());
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ch.d f40701h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public o1 f40702i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f40703j;

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, long j5, LogType logType, Long l5, Long l6, ManualLogCategory manualLogCategory, int i11) {
            int i12 = AddManualLogActivity.f40697k;
            if ((i11 & 4) != 0) {
                logType = LogType.f40695c;
            }
            String str = null;
            if ((i11 & 8) != 0) {
                l5 = null;
            }
            if ((i11 & 16) != 0) {
                l6 = null;
            }
            if ((i11 & 32) != 0) {
                manualLogCategory = null;
            }
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(logType, "logType");
            Intent putExtra = new Intent(context, AddManualLogActivity.class).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j5).putExtra("extra_log_type", logType).putExtra("extra_measuregroup_id", l5).putExtra(HmsMessageService.SUBJECT_ID, l6);
            if (manualLogCategory != null) {
                str = manualLogCategory.name();
            }
            Intent putExtra2 = putExtra.putExtra("com.withings.wiscale2.EXTRA_CATEGORY_NAME", str);
            kotlin.jvm.internal.u.i(putExtra2, "putExtra(...)");
            return putExtra2;
        }
    }

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LogType f40705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LogType logType) {
            super(2);
            this.f40705b = logType;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -106859350, new u0(AddManualLogActivity.this, this.f40705b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f40706a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ym0.l lVar) {
            this.f40706a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f40706a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f40706a;
        }

        public final int hashCode() {
            return this.f40706a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40706a.invoke(obj);
        }
    }

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<ManualLogCategory> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final ManualLogCategory invoke() {
            String string;
            Bundle extras = AddManualLogActivity.this.getIntent().getExtras();
            if (extras != null && (string = extras.getString("com.withings.wiscale2.EXTRA_CATEGORY_NAME")) != null) {
                return ManualLogCategory.valueOf(string);
            }
            return null;
        }
    }

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Long> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            Bundle extras = AddManualLogActivity.this.getIntent().getExtras();
            if (extras != null) {
                return Long.valueOf(extras.getLong(HmsMessageService.SUBJECT_ID));
            }
            throw new IllegalStateException("Missing subjectId parameter");
        }
    }

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<Long> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            Bundle extras = AddManualLogActivity.this.getIntent().getExtras();
            if (extras != null) {
                return Long.valueOf(extras.getLong(HealthUserProfile.USER_PROFILE_KEY_USER_ID));
            }
            throw new IllegalStateException("Missing User parameter");
        }
    }

    public AddManualLogActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new androidx.activity.result.a() { // from class: com.withings.manualLogging.ui.feature.addNote.f
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                int i11 = AddManualLogActivity.f40697k;
                AddManualLogActivity this$0 = AddManualLogActivity.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (((ActivityResult) obj).b() == -1) {
                    this$0.finish();
                }
            }
        });
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f40703j = registerForActivityResult;
    }

    public static final void A3(AddManualLogActivity addManualLogActivity, k1 k1Var, LogType logType, androidx.compose.runtime.a aVar, int i11) {
        addManualLogActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1635633193);
        r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], g11);
        xb.b v11 = androidx.activity.b0.v(g11);
        c11.D().b(v11);
        xb.a.a(v11, ah.k.p(androidx.compose.ui.e.f8927a), null, 0.0f, 0L, 0L, 0L, s1.b.b(g11, -2136775708, new r(c11, logType, addManualLogActivity, k1Var)), g11, 12582920, 124);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new s(addManualLogActivity, k1Var, logType, i11));
        }
    }

    public static final ManualLogCategory B3(AddManualLogActivity addManualLogActivity) {
        return (ManualLogCategory) addManualLogActivity.f40700g.getValue();
    }

    public static final long C3(AddManualLogActivity addManualLogActivity) {
        return ((Number) addManualLogActivity.f40698e.getValue()).longValue();
    }

    public static final long D3(AddManualLogActivity addManualLogActivity) {
        return ((Number) addManualLogActivity.f40699f.getValue()).longValue();
    }

    public static final boolean E3(AddManualLogActivity addManualLogActivity, ManualLogCategory manualLogCategory) {
        addManualLogActivity.getClass();
        if (kotlin.collections.x.W(ManualLogCategory.f41646n, ManualLogCategory.f41642j, ManualLogCategory.f41643k).contains(manualLogCategory) && ((Number) addManualLogActivity.f40698e.getValue()).longValue() <= 0) {
            return false;
        }
        return true;
    }

    public static final void F3(AddManualLogActivity addManualLogActivity, User user) {
        addManualLogActivity.getClass();
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(addManualLogActivity.getPackageName(), "com.withings.wiscale2.activity.logging.ui.EditWorkoutActivity").putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("shouldShowWorkoutLaunchType", true);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        addManualLogActivity.f40703j.a(putExtra);
    }

    public static final void G3(AddManualLogActivity addManualLogActivity, long j5) {
        ch.d dVar = addManualLogActivity.f40701h;
        if (dVar != null) {
            addManualLogActivity.f40703j.a(ch.a.a(dVar.B(), addManualLogActivity, 0, j5, 0L, false, null, 58));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final void H3(AddManualLogActivity addManualLogActivity, int i11, User user) {
        ch.d dVar = addManualLogActivity.f40701h;
        if (dVar != null) {
            addManualLogActivity.f40703j.a(ah.q.d(dVar.i(), addManualLogActivity, i11, user.q()));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final void z3(AddManualLogActivity addManualLogActivity, k1.r0 r0Var, k1 k1Var, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        addManualLogActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1832343509);
        k1.r0 b10 = t1.d.b(k1Var.G0(), null, g11);
        g11.s(1005061104);
        boolean K = g11.K((String) b10.getValue());
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f((String) b10.getValue(), androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var2 = (k1.r0) t11;
        g11.J();
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            g11.s(1005061259);
            int i12 = (i11 & 14) ^ 6;
            boolean z11 = true;
            if ((i12 > 4 && g11.K(r0Var)) || (i11 & 6) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t12 = g11.t();
            if (z5 || t12 == a.C0060a.a()) {
                t12 = new g(r0Var);
                g11.n(t12);
            }
            ym0.a aVar2 = (ym0.a) t12;
            g11.J();
            s1.a b11 = s1.b.b(g11, 1951076932, new k(r0Var2, addManualLogActivity, k1Var, r0Var));
            String u11 = ay.b.u(C1987R.string._START_, g11);
            l lVar = new l(r0Var, r0Var2, k1Var);
            String u12 = ay.b.u(C1987R.string._CANCEL_, g11);
            g11.s(1005062643);
            if ((i12 <= 4 || !g11.K(r0Var)) && (i11 & 6) != 4) {
                z11 = false;
            }
            Object t13 = g11.t();
            if (z11 || t13 == a.C0060a.a()) {
                t13 = new m(r0Var);
                g11.n(t13);
            }
            g11.J();
            wk.p.b(aVar2, "Patient id", b11, u11, 0L, lVar, u12, 0L, (ym0.a) t13, g11, 432, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(addManualLogActivity, r0Var, k1Var, i11));
        }
    }

    @Override // com.withings.manualLogging.ui.feature.addNote.Hilt_AddManualLogActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        Intent intent = getIntent();
        kotlin.jvm.internal.u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = intent.getSerializableExtra("extra_log_type", LogType.class);
        } else {
            Object serializableExtra = intent.getSerializableExtra("extra_log_type");
            if (!(serializableExtra instanceof LogType)) {
                serializableExtra = null;
            }
            obj = (LogType) serializableExtra;
        }
        LogType logType = (LogType) obj;
        if (logType == null) {
            logType = LogType.f40695c;
        }
        e.k.a(this, new s1.a(true, -1884946672, new b(logType)));
    }
}
