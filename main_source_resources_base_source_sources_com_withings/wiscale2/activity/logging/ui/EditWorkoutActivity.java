package com.withings.wiscale2.activity.logging.ui;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.google.android.material.button.MaterialButton;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.logging.ui.m0;
import com.withings.wiscale2.activity.workout.category.ui.ChooseWorkoutCategoryActivity;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.workout.workoutdata.WorkoutData;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import l70.w;
import org.joda.time.DateTime;
/* compiled from: EditWorkoutActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/logging/ui/EditWorkoutActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EditWorkoutActivity extends Hilt_EditWorkoutActivity {
    public static final /* synthetic */ int S = 0;
    private androidx.appcompat.app.c A;
    private m0 Q;
    private final l70.w R;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public t0 f48280e;

    /* renamed from: x  reason: collision with root package name */
    private ProgressDialog f48299x;

    /* renamed from: y  reason: collision with root package name */
    private androidx.appcompat.app.c f48300y;

    /* renamed from: z  reason: collision with root package name */
    private androidx.appcompat.app.c f48301z;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f48281f = nm0.h.b(new v());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f48282g = nm0.h.b(new p());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f48283h = nm0.h.b(new r());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f48284i = nm0.h.b(new j());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f48285j = nm0.h.b(new t());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f48286k = nm0.h.b(new x());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f48287l = nm0.h.b(new b());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f48288m = nm0.h.b(new z());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f48289n = nm0.h.b(new n());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f48290o = nm0.h.b(new f());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f48291p = nm0.h.b(new u());

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f48292q = nm0.h.b(new l());

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f48293r = nm0.h.b(new c());

    /* renamed from: s  reason: collision with root package name */
    private final nm0.g f48294s = nm0.h.b(new g());

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f48295t = nm0.h.b(new o());

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f48296u = nm0.h.b(new i());

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f48297v = nm0.h.b(new h());

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f48298w = nm0.h.b(new k());
    private final nm0.g B = nm0.h.b(new w());
    private final nm0.g F = nm0.h.b(new y());
    private final nm0.g G = nm0.h.b(new s());
    private final nm0.g M = nm0.h.b(new d());
    private final nm0.g P = nm0.h.b(new e());

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, User user, WorkoutCategory workoutCategory, long j5, boolean z5) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(user, "user");
            Intent intent = new Intent(context, EditWorkoutActivity.class);
            intent.putExtra(MessageType.TRACK, j5);
            intent.putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
            intent.putExtra("category", workoutCategory);
            intent.putExtra("shouldShowWorkoutLaunchType", z5);
            return intent;
        }

        public static Intent b(Context context, User user, DateTime dateTime, WorkoutCategory workoutCategory, boolean z5) {
            Long l5;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(user, "user");
            Intent intent = new Intent(context, EditWorkoutActivity.class);
            intent.putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
            if (dateTime != null) {
                l5 = Long.valueOf(dateTime.getMillis());
            } else {
                l5 = null;
            }
            intent.putExtra("date", l5);
            intent.putExtra("category", workoutCategory);
            intent.putExtra("shouldShowWorkoutLaunchType", z5);
            return intent;
        }

        public static /* synthetic */ Intent c(Context context, User user, int i11) {
            boolean z5;
            if ((i11 & 16) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return b(context, user, null, null, z5);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) EditWorkoutActivity.this.findViewById(C1987R.id.intensity_text);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) EditWorkoutActivity.this.findViewById(C1987R.id.calories_layout);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<WorkoutCategory> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final WorkoutCategory invoke() {
            Object parcelableExtra;
            Intent intent = EditWorkoutActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("category", WorkoutCategory.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("category");
            }
            return (WorkoutCategory) parcelableExtra;
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Long> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            long longExtra = EditWorkoutActivity.this.getIntent().getLongExtra("date", -1L);
            Long valueOf = Long.valueOf(longExtra);
            if (longExtra == -1) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<MaterialButton> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final MaterialButton invoke() {
            return (MaterialButton) EditWorkoutActivity.this.findViewById(C1987R.id.button_delete);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) EditWorkoutActivity.this.findViewById(C1987R.id.distance_layout);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<tb0.i> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.i invoke() {
            return tb0.i.b(LayoutInflater.from(EditWorkoutActivity.this));
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<tb0.j> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.j invoke() {
            return tb0.j.b(LayoutInflater.from(EditWorkoutActivity.this));
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<View> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return EditWorkoutActivity.this.findViewById(C1987R.id.edit_glyph);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<tb0.k> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.k invoke() {
            return tb0.k.b(LayoutInflater.from(EditWorkoutActivity.this));
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) EditWorkoutActivity.this.findViewById(C1987R.id.end_date_time_layout);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        m() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(EditWorkoutActivity.this.getIntent().getBooleanExtra("fromDetailView", false));
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class n extends kotlin.jvm.internal.w implements ym0.a<SeekBar> {
        n() {
            super(0);
        }

        @Override // ym0.a
        public final SeekBar invoke() {
            return (SeekBar) EditWorkoutActivity.this.findViewById(C1987R.id.intensity_seekbar);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class o extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        o() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) EditWorkoutActivity.this.findViewById(C1987R.id.laps_layout);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class p extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        p() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) EditWorkoutActivity.this.findViewById(C1987R.id.progress_bar);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class q implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f48317a;

        q(ym0.l lVar) {
            this.f48317a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f48317a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f48317a;
        }

        public final int hashCode() {
            return this.f48317a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48317a.invoke(obj);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class r extends kotlin.jvm.internal.w implements ym0.a<NestedScrollView> {
        r() {
            super(0);
        }

        @Override // ym0.a
        public final NestedScrollView invoke() {
            return (NestedScrollView) EditWorkoutActivity.this.findViewById(C1987R.id.scroll_view);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class s extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        s() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(EditWorkoutActivity.this.getIntent().getBooleanExtra("shouldShowWorkoutLaunchType", true));
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class t extends kotlin.jvm.internal.w implements ym0.a<View> {
        t() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return EditWorkoutActivity.this.findViewById(C1987R.id.sport_layout);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class u extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        u() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) EditWorkoutActivity.this.findViewById(C1987R.id.start_date_time_layout);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class v extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        v() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) EditWorkoutActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class w extends kotlin.jvm.internal.w implements ym0.a<User> {
        w() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            Object parcelableExtra;
            Intent intent = EditWorkoutActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, User.class);
            } else {
                parcelableExtra = intent.getParcelableExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            }
            kotlin.jvm.internal.u.g(parcelableExtra);
            return (User) parcelableExtra;
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class x extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        x() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) EditWorkoutActivity.this.findViewById(C1987R.id.activity_category_image);
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class y extends kotlin.jvm.internal.w implements ym0.a<Long> {
        y() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            long longExtra = EditWorkoutActivity.this.getIntent().getLongExtra(MessageType.TRACK, -1L);
            Long valueOf = Long.valueOf(longExtra);
            if (longExtra == -1) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: EditWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class z extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        z() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EditWorkoutActivity.this.findViewById(C1987R.id.activity_name_text);
        }
    }

    public EditWorkoutActivity() {
        nm0.h.b(new m());
        oi0.b.h();
        WorkoutManager.Companion.get();
        this.R = w.a.a();
        WorkoutCategoryManager.get();
        lj0.h0.e();
        a.d.a(this);
    }

    public static void A3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            m0Var.q1();
            m0 m0Var2 = this$0.Q;
            if (m0Var2 != null) {
                Track value = m0Var2.U0().getValue();
                if (value != null) {
                    EditText editText = this$0.C4().f99157c;
                    Parcelable data = value.getData();
                    kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
                    editText.setText(String.valueOf(((WorkoutData) data).getCalories()));
                }
                this$0.getWindow().setSoftInputMode(3);
                androidx.appcompat.app.c cVar = this$0.f48301z;
                if (cVar != null) {
                    cVar.dismiss();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    private final void A4() {
        m0 m0Var = this.Q;
        if (m0Var != null) {
            Track value = m0Var.U0().getValue();
            if (value != null) {
                ChooseWorkoutCategoryActivity.a aVar = ChooseWorkoutCategoryActivity.f48655i;
                int category = value.getCategory();
                boolean booleanValue = ((Boolean) this.G.getValue()).booleanValue();
                Integer valueOf = Integer.valueOf(category);
                aVar.getClass();
                startActivityForResult(ChooseWorkoutCategoryActivity.a.a(this, (User) this.B.getValue(), booleanValue, valueOf), 1);
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.withings.wiscale2.activity.logging.ui.k] */
    public static void B3(final EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            Track value = m0Var.U0().getValue();
            if (value != null) {
                final ?? r12 = new TimePickerDialog.OnTimeSetListener() { // from class: com.withings.wiscale2.activity.logging.ui.k
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i11, int i12) {
                        EditWorkoutActivity.V3(EditWorkoutActivity.this, i11, i12);
                    }
                };
                this$0.B4(value.getEndDate(), new DatePickerDialog.OnDateSetListener() { // from class: com.withings.wiscale2.activity.logging.ui.l
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i11, int i12, int i13) {
                        EditWorkoutActivity.S3(EditWorkoutActivity.this, r12, i11, i12, i13);
                    }
                }).show();
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    private final DatePickerDialog B4(DateTime dateTime, DatePickerDialog.OnDateSetListener onDateSetListener) {
        DateTime now = DateTime.now();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, onDateSetListener, dateTime.getYear(), dateTime.getMonthOfYear() - 1, dateTime.getDayOfMonth());
        datePickerDialog.getDatePicker().setMaxDate(now.getMillis());
        datePickerDialog.setTitle("");
        return datePickerDialog;
    }

    public static void C3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            m0Var.o1();
            this$0.getWindow().setSoftInputMode(3);
            androidx.appcompat.app.c cVar = this$0.A;
            if (cVar != null) {
                cVar.dismiss();
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    private final tb0.i C4() {
        return (tb0.i) this.f48297v.getValue();
    }

    public static void D3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        String obj = this$0.E4().f99254b.getText().toString();
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            m0Var.C1(obj);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    private final tb0.j D4() {
        return (tb0.j) this.f48296u.getValue();
    }

    public static void E3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.appcompat.app.c cVar = this$0.f48300y;
        if (cVar != null) {
            cVar.show();
        }
    }

    private final tb0.k E4() {
        return (tb0.k) this.f48298w.getValue();
    }

    public static void F3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.appcompat.app.c cVar = this$0.f48301z;
        if (cVar != null) {
            cVar.show();
        }
    }

    private final androidx.appcompat.app.c F4(ym0.l<? super c.a, ? extends View> lVar) {
        qc.b bVar = new qc.b(this);
        bVar.h(getString(C1987R.string._CANCEL_), new dq.f(this, 2));
        androidx.appcompat.app.c create = bVar.D(lVar.invoke(bVar)).create();
        Window window = create.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return create;
    }

    public static void G3(EditWorkoutActivity this$0, int i11, int i12) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            DateTime withTime = new DateTime(m0Var.g1()).withTime(i11, i12, 0, 0);
            m0 m0Var2 = this$0.Q;
            if (m0Var2 != null) {
                kotlin.jvm.internal.u.g(withTime);
                m0Var2.y1(withTime);
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    private final void G4(String str, String str2, String str3, boolean z5) {
        try {
            if (z5) {
                m0 m0Var = this.Q;
                if (m0Var != null) {
                    m0Var.r1(str, str2);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            m0 m0Var2 = this.Q;
            if (m0Var2 != null) {
                m0Var2.s1(str3);
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        } catch (NumberFormatException unused) {
            String string = getString(C1987R.string._ERROR_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            String string2 = getString(C1987R.string._INCORRECT_MEASURE_);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            qc.b B = new qc.b(this).B(string);
            B.x(C1987R.string._OK_, null);
            B.v(string2);
            B.s();
        }
    }

    public static void H3(EditWorkoutActivity this$0, boolean z5, int i11, KeyEvent keyEvent) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i11 == 6) {
            this$0.G4(this$0.D4().f99215b.getText().toString(), this$0.D4().f99216c.getText().toString(), this$0.D4().f99217d.getText().toString(), z5);
        }
    }

    public static void I3(EditWorkoutActivity this$0, Track workout) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(workout, "$workout");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(m0Var), null, null, new r0(m0Var, workout, null), 3, null);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static void J3(SparseArray array, EditWorkoutActivity this$0, int i11) {
        kotlin.jvm.internal.u.j(array, "$array");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        int keyAt = array.keyAt(i11);
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            m0Var.K0(Integer.valueOf(keyAt));
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static void K3(EditWorkoutActivity this$0, TimePickerDialog.OnTimeSetListener timeSetListener, int i11, int i12, int i13) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(timeSetListener, "$timeSetListener");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            DateTime g12 = m0Var.g1();
            DateTime dateTime = new DateTime(i11, i12 + 1, i13, g12.getHourOfDay(), g12.getMinuteOfHour());
            m0 m0Var2 = this$0.Q;
            if (m0Var2 != null) {
                m0Var2.y1(dateTime);
                TimePickerDialog timePickerDialog = new TimePickerDialog(this$0, timeSetListener, dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), DateFormat.is24HourFormat(this$0));
                timePickerDialog.setTitle("");
                timePickerDialog.show();
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static void L3(EditWorkoutActivity this$0, androidx.appcompat.app.c alertDialog) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(alertDialog, "$alertDialog");
        EditText editDistanceKm = this$0.D4().f99215b;
        kotlin.jvm.internal.u.i(editDistanceKm, "editDistanceKm");
        editDistanceKm.addTextChangedListener(new com.withings.wiscale2.activity.logging.ui.n(alertDialog));
        EditText editDistanceM = this$0.D4().f99216c;
        kotlin.jvm.internal.u.i(editDistanceM, "editDistanceM");
        editDistanceM.addTextChangedListener(new com.withings.wiscale2.activity.logging.ui.n(alertDialog));
        EditText editDistanceMiles = this$0.D4().f99217d;
        kotlin.jvm.internal.u.i(editDistanceMiles, "editDistanceMiles");
        editDistanceMiles.addTextChangedListener(new com.withings.wiscale2.activity.logging.ui.n(alertDialog));
    }

    public static void M3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.A4();
    }

    public static void N3(EditWorkoutActivity this$0, androidx.appcompat.app.c alertDialog) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(alertDialog, "$alertDialog");
        EditText editCalories = this$0.C4().f99157c;
        kotlin.jvm.internal.u.i(editCalories, "editCalories");
        editCalories.addTextChangedListener(new com.withings.wiscale2.activity.logging.ui.n(alertDialog));
    }

    public static void O3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.appcompat.app.c cVar = this$0.A;
        if (cVar != null) {
            cVar.show();
        }
    }

    public static void P3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            m0Var.K0(null);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static void Q3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            m0Var.A1();
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static void R3(EditWorkoutActivity this$0, int i11, KeyEvent keyEvent) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (keyEvent != null) {
            if (keyEvent.getKeyCode() == 66 || i11 == 6) {
                m0 m0Var = this$0.Q;
                if (m0Var != null) {
                    m0Var.w1(Integer.parseInt(this$0.C4().f99157c.getText().toString()));
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
        }
    }

    public static void S3(EditWorkoutActivity this$0, TimePickerDialog.OnTimeSetListener timeSetListener, int i11, int i12, int i13) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(timeSetListener, "$timeSetListener");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            DateTime W0 = m0Var.W0();
            DateTime dateTime = new DateTime(i11, i12 + 1, i13, W0.getHourOfDay(), W0.getMinuteOfHour());
            m0 m0Var2 = this$0.Q;
            if (m0Var2 != null) {
                m0Var2.t1(dateTime);
                TimePickerDialog timePickerDialog = new TimePickerDialog(this$0, timeSetListener, dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), DateFormat.is24HourFormat(this$0));
                timePickerDialog.setTitle("");
                timePickerDialog.show();
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.withings.wiscale2.activity.logging.ui.m] */
    public static void T3(final EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            Track value = m0Var.U0().getValue();
            if (value != null) {
                final ?? r12 = new TimePickerDialog.OnTimeSetListener() { // from class: com.withings.wiscale2.activity.logging.ui.m
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i11, int i12) {
                        EditWorkoutActivity.G3(EditWorkoutActivity.this, i11, i12);
                    }
                };
                this$0.B4(value.getStartDate(), new DatePickerDialog.OnDateSetListener() { // from class: com.withings.wiscale2.activity.logging.ui.b
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i11, int i12, int i13) {
                        EditWorkoutActivity.K3(EditWorkoutActivity.this, r12, i11, i12, i13);
                    }
                }).show();
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static void U3(EditWorkoutActivity this$0, int i11, KeyEvent keyEvent) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i11 == 6) {
            m0 m0Var = this$0.Q;
            if (m0Var != null) {
                m0Var.C1(this$0.E4().f99254b.getText().toString());
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
    }

    public static void V3(EditWorkoutActivity this$0, int i11, int i12) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            DateTime withTime = new DateTime(m0Var.W0()).withTime(i11, i12, 0, 0);
            m0 m0Var2 = this$0.Q;
            if (m0Var2 != null) {
                kotlin.jvm.internal.u.g(withTime);
                m0Var2.t1(withTime);
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static void W3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.A4();
    }

    public static void X3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            m0Var.w1(Integer.parseInt(this$0.C4().f99157c.getText().toString()));
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static void Y3(EditWorkoutActivity this$0, boolean z5, DialogInterface dialogInterface) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.G4(this$0.D4().f99215b.getText().toString(), this$0.D4().f99216c.getText().toString(), this$0.D4().f99217d.getText().toString(), z5);
        dialogInterface.dismiss();
    }

    public static final LineCellView Z3(EditWorkoutActivity editWorkoutActivity) {
        return (LineCellView) editWorkoutActivity.f48287l.getValue();
    }

    public static final LineCellView a4(EditWorkoutActivity editWorkoutActivity) {
        return (LineCellView) editWorkoutActivity.f48293r.getValue();
    }

    public static final WorkoutCategory b4(EditWorkoutActivity editWorkoutActivity) {
        return (WorkoutCategory) editWorkoutActivity.M.getValue();
    }

    public static final Long c4(EditWorkoutActivity editWorkoutActivity) {
        return (Long) editWorkoutActivity.P.getValue();
    }

    public static final MaterialButton d4(EditWorkoutActivity editWorkoutActivity) {
        return (MaterialButton) editWorkoutActivity.f48290o.getValue();
    }

    public static final LineCellView e4(EditWorkoutActivity editWorkoutActivity) {
        return (LineCellView) editWorkoutActivity.f48294s.getValue();
    }

    public static final LineCellView f4(EditWorkoutActivity editWorkoutActivity) {
        return (LineCellView) editWorkoutActivity.f48292q.getValue();
    }

    public static final SeekBar g4(EditWorkoutActivity editWorkoutActivity) {
        return (SeekBar) editWorkoutActivity.f48289n.getValue();
    }

    public static final LineCellView h4(EditWorkoutActivity editWorkoutActivity) {
        return (LineCellView) editWorkoutActivity.f48295t.getValue();
    }

    public static final ProgressBar i4(EditWorkoutActivity editWorkoutActivity) {
        return (ProgressBar) editWorkoutActivity.f48282g.getValue();
    }

    public static final NestedScrollView j4(EditWorkoutActivity editWorkoutActivity) {
        return (NestedScrollView) editWorkoutActivity.f48283h.getValue();
    }

    public static final boolean k4(EditWorkoutActivity editWorkoutActivity) {
        return ((Boolean) editWorkoutActivity.G.getValue()).booleanValue();
    }

    public static final LineCellView l4(EditWorkoutActivity editWorkoutActivity) {
        return (LineCellView) editWorkoutActivity.f48291p.getValue();
    }

    public static final User m4(EditWorkoutActivity editWorkoutActivity) {
        return (User) editWorkoutActivity.B.getValue();
    }

    public static final FrameLayout n4(final EditWorkoutActivity editWorkoutActivity, c.a aVar, m0.c cVar, final boolean z5) {
        int i11;
        if (cVar != null) {
            LinearLayout linearLayout = editWorkoutActivity.D4().f99218e;
            int i12 = 8;
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
            LinearLayout linearLayout2 = editWorkoutActivity.D4().f99219f;
            if (!z5) {
                i12 = 0;
            }
            linearLayout2.setVisibility(i12);
            if (z5) {
                editWorkoutActivity.D4().f99215b.setText(String.valueOf(cVar.a()));
                editWorkoutActivity.D4().f99216c.setText(String.valueOf(cVar.c()));
            } else {
                editWorkoutActivity.D4().f99217d.setText(String.valueOf(cVar.b()));
            }
        } else {
            editWorkoutActivity.getClass();
        }
        aVar.p(C1987R.string._DISTANCE_);
        aVar.m(editWorkoutActivity.getString(C1987R.string._OK_), new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.activity.logging.ui.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                EditWorkoutActivity.Y3(EditWorkoutActivity.this, z5, dialogInterface);
            }
        });
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: com.withings.wiscale2.activity.logging.ui.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                EditWorkoutActivity.H3(EditWorkoutActivity.this, z5, i13, keyEvent);
                return false;
            }
        };
        editWorkoutActivity.D4().f99216c.setOnEditorActionListener(onEditorActionListener);
        editWorkoutActivity.D4().f99217d.setOnEditorActionListener(onEditorActionListener);
        FrameLayout a11 = editWorkoutActivity.D4().a();
        kotlin.jvm.internal.u.i(a11, "getRoot(...)");
        return a11;
    }

    public static final ConstraintLayout o4(final EditWorkoutActivity editWorkoutActivity, c.a aVar, m0.b bVar) {
        editWorkoutActivity.C4().f99157c.setText(String.valueOf((int) bVar.a()));
        editWorkoutActivity.C4().f99156b.setOnClickListener(new io.j(editWorkoutActivity, 3));
        aVar.p(C1987R.string._CALORIES_);
        aVar.m(editWorkoutActivity.getString(C1987R.string._OK_), new iq.c(editWorkoutActivity, 2));
        editWorkoutActivity.C4().f99157c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.withings.wiscale2.activity.logging.ui.j
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                EditWorkoutActivity.R3(EditWorkoutActivity.this, i11, keyEvent);
                return false;
            }
        });
        ConstraintLayout a11 = editWorkoutActivity.C4().a();
        kotlin.jvm.internal.u.i(a11, "getRoot(...)");
        return a11;
    }

    public static final ConstraintLayout p4(final EditWorkoutActivity editWorkoutActivity, c.a aVar, Integer num) {
        editWorkoutActivity.E4().f99254b.setText((num == null || (r4 = num.toString()) == null) ? "-" : "-");
        aVar.p(C1987R.string._SWIM_LAPS_);
        aVar.m(editWorkoutActivity.getString(C1987R.string._OK_), new ao.i(editWorkoutActivity, 4));
        editWorkoutActivity.E4().f99254b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.withings.wiscale2.activity.logging.ui.i
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                EditWorkoutActivity.U3(EditWorkoutActivity.this, i11, keyEvent);
                return false;
            }
        });
        editWorkoutActivity.E4().f99255c.setOnClickListener(new androidx.media3.ui.i(editWorkoutActivity, 8));
        ConstraintLayout a11 = editWorkoutActivity.E4().a();
        kotlin.jvm.internal.u.i(a11, "getRoot(...)");
        return a11;
    }

    public static final ImageView r4(EditWorkoutActivity editWorkoutActivity) {
        return (ImageView) editWorkoutActivity.f48286k.getValue();
    }

    public static final Long s4(EditWorkoutActivity editWorkoutActivity) {
        return (Long) editWorkoutActivity.F.getValue();
    }

    public static final TextView t4(EditWorkoutActivity editWorkoutActivity) {
        return (TextView) editWorkoutActivity.f48288m.getValue();
    }

    public static final void u4(EditWorkoutActivity editWorkoutActivity, m0.b bVar) {
        if (editWorkoutActivity.f48301z == null) {
            androidx.appcompat.app.c F4 = editWorkoutActivity.F4(new com.withings.wiscale2.activity.logging.ui.p(editWorkoutActivity, bVar));
            F4.setOnShowListener(new com.withings.wiscale2.activity.logging.ui.h(editWorkoutActivity, F4, 0));
            editWorkoutActivity.f48301z = F4;
        }
    }

    public static final void v4(final EditWorkoutActivity editWorkoutActivity, m0.c cVar, boolean z5) {
        if (editWorkoutActivity.f48300y == null) {
            final androidx.appcompat.app.c F4 = editWorkoutActivity.F4(new com.withings.wiscale2.activity.logging.ui.q(editWorkoutActivity, cVar, z5));
            F4.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.wiscale2.activity.logging.ui.e
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    EditWorkoutActivity.L3(EditWorkoutActivity.this, F4);
                }
            });
            editWorkoutActivity.f48300y = F4;
        }
    }

    public static final void w4(EditWorkoutActivity editWorkoutActivity, Integer num) {
        if (editWorkoutActivity.A == null) {
            editWorkoutActivity.A = editWorkoutActivity.F4(new com.withings.wiscale2.activity.logging.ui.s(editWorkoutActivity, num));
        }
    }

    public static final void x4(EditWorkoutActivity editWorkoutActivity, boolean z5) {
        SparseArray<String> sparseArray;
        if (z5) {
            m0 m0Var = editWorkoutActivity.Q;
            if (m0Var != null) {
                Track value = m0Var.U0().getValue();
                if (value == null || (sparseArray = TrackKt.deleteReasons(value, editWorkoutActivity)) == null) {
                    sparseArray = new SparseArray<>();
                }
                CharSequence[] charSequenceArr = new CharSequence[sparseArray.size()];
                int size = sparseArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    charSequenceArr[i11] = sparseArray.valueAt(i11);
                }
                qc.b B = new qc.b(editWorkoutActivity).B(editWorkoutActivity.getString(C1987R.string._DELETE_ACTIVITY_ITEM_));
                B.u(charSequenceArr, new sg.l(1, sparseArray, editWorkoutActivity));
                B.w(C1987R.string._CANCEL_, null).s();
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        editWorkoutActivity.getClass();
        qc.b B2 = new qc.b(editWorkoutActivity).B(editWorkoutActivity.getString(C1987R.string._DELETE_MANUAL_ACTIVITY_CONFIRMATION_));
        B2.A(editWorkoutActivity.getString(C1987R.string._YES_), new ao.c(editWorkoutActivity, 2));
        B2.h(editWorkoutActivity.getString(C1987R.string._CANCEL_), null);
        B2.s();
    }

    public static final void y4(EditWorkoutActivity editWorkoutActivity, String str, String str2) {
        editWorkoutActivity.getClass();
        qc.b B = new qc.b(editWorkoutActivity).B(str);
        B.x(C1987R.string._OK_, null);
        B.v(str2);
        B.s();
    }

    public static void z3(EditWorkoutActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        m0 m0Var = this$0.Q;
        if (m0Var != null) {
            vh.h.b(m0Var);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static final void z4(final EditWorkoutActivity editWorkoutActivity, boolean z5) {
        if (z5) {
            if (editWorkoutActivity.f48299x == null) {
                ProgressDialog progressDialog = new ProgressDialog(editWorkoutActivity);
                progressDialog.setMessage(editWorkoutActivity.getString(C1987R.string._LOADING_));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(true);
                progressDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.withings.wiscale2.activity.logging.ui.g
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        EditWorkoutActivity.z3(EditWorkoutActivity.this);
                    }
                });
                editWorkoutActivity.f48299x = progressDialog;
            }
            ProgressDialog progressDialog2 = editWorkoutActivity.f48299x;
            if (progressDialog2 != null) {
                progressDialog2.show();
                return;
            }
            return;
        }
        ProgressDialog progressDialog3 = editWorkoutActivity.f48299x;
        if (progressDialog3 != null) {
            progressDialog3.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        Bundle extras;
        Object parcelable;
        if (i11 == 1) {
            if (i12 == -1) {
                nm0.y yVar = null;
                if (intent != null && (extras = intent.getExtras()) != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = extras.getParcelable("result_category", WorkoutCategory.class);
                    } else {
                        parcelable = extras.getParcelable("result_category");
                    }
                    WorkoutCategory workoutCategory = (WorkoutCategory) parcelable;
                    if (workoutCategory != null) {
                        m0 m0Var = this.Q;
                        if (m0Var != null) {
                            m0Var.z1(workoutCategory);
                            yVar = nm0.y.f85009a;
                        } else {
                            kotlin.jvm.internal.u.s("viewModel");
                            throw null;
                        }
                    }
                }
                if (yVar == null) {
                    finish();
                }
            } else if (((WorkoutCategory) this.M.getValue()) == null) {
                finish();
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.withings.wiscale2.activity.logging.ui.Hilt_EditWorkoutActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_new_edit_workout);
        setSupportActionBar((Toolbar) this.f48281f.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.s(y70.a.c(C1987R.drawable.icon_medium_navigation_close, this, ah.u.w(C1987R.attr.colorOnSurface, this, -65281)));
            if (((Long) this.F.getValue()) != null) {
                i11 = C1987R.string._EDIT_;
            } else {
                i11 = C1987R.string._NEW_ACTIVITY_;
            }
            supportActionBar.v(i11);
        }
        ((SeekBar) this.f48289n.getValue()).setOnSeekBarChangeListener(new com.withings.wiscale2.activity.logging.ui.r(this));
        ((LineCellView) this.f48293r.getValue()).setOnClickListener(new sg.f(this, 8));
        ((LineCellView) this.f48294s.getValue()).setOnClickListener(new sg.g(this, 5));
        ((LineCellView) this.f48295t.getValue()).setOnClickListener(new dq.a(this, 1));
        ((LineCellView) this.f48291p.getValue()).setOnClickListener(new gi.e(this, 3));
        ((LineCellView) this.f48292q.getValue()).setOnClickListener(new gi.f(this, 8));
        ((View) this.f48284i.getValue()).setOnClickListener(new androidx.viewpager.widget.c(this, 6));
        ((View) this.f48285j.getValue()).setOnClickListener(new androidx.viewpager.widget.d(this, 3));
        ((MaterialButton) this.f48290o.getValue()).setOnClickListener(new vn.d(this, 3));
        m0 m0Var = (m0) new k1(this, new com.withings.wiscale2.activity.logging.ui.t(this)).a(m0.class);
        this.Q = m0Var;
        m0Var.n1().observe(this, new q(new com.withings.wiscale2.activity.logging.ui.u(this)));
        m0 m0Var2 = this.Q;
        if (m0Var2 != null) {
            m0Var2.U0().observe(this, new q(new com.withings.wiscale2.activity.logging.ui.v(this)));
            m0 m0Var3 = this.Q;
            if (m0Var3 != null) {
                m0Var3.R0().observe(this, new q(new com.withings.wiscale2.activity.logging.ui.w(this)));
                m0 m0Var4 = this.Q;
                if (m0Var4 != null) {
                    m0Var4.T0().observe(this, new q(new com.withings.wiscale2.activity.logging.ui.x(this)));
                    m0 m0Var5 = this.Q;
                    if (m0Var5 != null) {
                        m0Var5.M0().observe(this, new q(new com.withings.wiscale2.activity.logging.ui.y(this)));
                        m0 m0Var6 = this.Q;
                        if (m0Var6 != null) {
                            m0Var6.O0().t(this, new com.withings.wiscale2.activity.logging.ui.z(this));
                            m0 m0Var7 = this.Q;
                            if (m0Var7 != null) {
                                m0Var7.X0().observe(this, new q(new a0(this)));
                                m0 m0Var8 = this.Q;
                                if (m0Var8 != null) {
                                    m0Var8.d1().observe(this, new q(new b0(this)));
                                    m0 m0Var9 = this.Q;
                                    if (m0Var9 != null) {
                                        m0Var9.Y0().observe(this, new q(new c0(this)));
                                        m0 m0Var10 = this.Q;
                                        if (m0Var10 != null) {
                                            m0Var10.i1().observe(this, new q(new d0(this)));
                                            m0 m0Var11 = this.Q;
                                            if (m0Var11 != null) {
                                                m0Var11.V0().observe(this, new q(new e0(this)));
                                                m0 m0Var12 = this.Q;
                                                if (m0Var12 != null) {
                                                    m0Var12.c1().observe(this, new q(new f0(this)));
                                                    m0 m0Var13 = this.Q;
                                                    if (m0Var13 != null) {
                                                        m0Var13.Z0().observe(this, new q(new g0(this)));
                                                        m0 m0Var14 = this.Q;
                                                        if (m0Var14 != null) {
                                                            m0Var14.e1().observe(this, new q(new h0(this)));
                                                            m0 m0Var15 = this.Q;
                                                            if (m0Var15 != null) {
                                                                m0Var15.l1().v(this, new i0(this));
                                                                m0 m0Var16 = this.Q;
                                                                if (m0Var16 != null) {
                                                                    m0Var16.a1().v(this, new j0(this));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.u.s("viewModel");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.u.s("viewModel");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.u.s("viewModel");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.u.s("viewModel");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.u.s("viewModel");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.u.s("viewModel");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.u.s("viewModel");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.u.s("viewModel");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("viewModel");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("viewModel");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("viewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.u.j(menu, "menu");
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(C1987R.menu.activity_edit_workout, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == C1987R.id.action_save) {
            m0 m0Var = this.Q;
            if (m0Var != null) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(m0Var), null, null, new q0(m0Var, null), 3, null);
                return true;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
