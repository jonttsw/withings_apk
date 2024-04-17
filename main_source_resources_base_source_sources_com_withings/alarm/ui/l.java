package com.withings.alarm.ui;

import ah.u;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.e1;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.AlarmRepeatView;
import com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmFragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.anim.ResizeAnimation;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import java.util.List;
import org.apache.http.message.TokenParser;
import org.joda.time.DateTime;
/* compiled from: AlarmViewHolder.java */
/* loaded from: classes3.dex */
public abstract class l extends RecyclerView.z implements AlarmRepeatView.a {

    /* renamed from: w */
    public static final List<Character> f31162w = Arrays.asList(Character.valueOf(TokenParser.SP), '!', Character.valueOf(TokenParser.DQUOTE), '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', Character.valueOf(TokenParser.ESCAPE), ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}');

    /* renamed from: a */
    protected DeviceAlarm f31163a;

    /* renamed from: b */
    protected d f31164b;

    /* renamed from: c */
    protected TextView f31165c;

    /* renamed from: d */
    protected TextView f31166d;

    /* renamed from: e */
    protected TextView f31167e;

    /* renamed from: f */
    protected TextView f31168f;

    /* renamed from: g */
    protected ImageView f31169g;

    /* renamed from: h */
    protected SwitchMaterial f31170h;

    /* renamed from: i */
    protected AlarmRepeatView f31171i;

    /* renamed from: j */
    protected ViewGroup f31172j;

    /* renamed from: k */
    protected View f31173k;

    /* renamed from: l */
    protected ViewGroup f31174l;

    /* renamed from: m */
    protected ViewGroup f31175m;

    /* renamed from: n */
    protected View f31176n;

    /* renamed from: o */
    protected View f31177o;

    /* renamed from: p */
    protected View f31178p;

    /* renamed from: q */
    protected TextView f31179q;

    /* renamed from: r */
    private boolean f31180r;

    /* renamed from: s */
    private boolean f31181s;

    /* renamed from: t */
    private boolean f31182t;

    /* renamed from: u */
    private boolean f31183u;

    /* renamed from: v */
    private sg.e f31184v;

    /* compiled from: AlarmViewHolder.java */
    /* loaded from: classes3.dex */
    public interface d {
        void I(DeviceAlarm deviceAlarm);

        void L0(l lVar);

        void N0(DeviceAlarm deviceAlarm);

        void P0(vg.a aVar, DeviceAlarm deviceAlarm);

        void c1(DeviceAlarm deviceAlarm);

        void e0(int i11);

        void p1();

        void u0(DeviceAlarm deviceAlarm);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sg.e] */
    public l(View view) {
        super(view);
        this.f31180r = false;
        this.f31181s = false;
        this.f31182t = false;
        this.f31183u = false;
        this.f31184v = new Object();
        TextView textView = (TextView) view.findViewById(C1987R.id.time);
        this.f31165c = textView;
        this.f31166d = (TextView) view.findViewById(C1987R.id.alarm_summary);
        TextView textView2 = (TextView) view.findViewById(C1987R.id.am_pm);
        this.f31167e = textView2;
        TextView textView3 = (TextView) view.findViewById(C1987R.id.alarm_delete);
        this.f31168f = textView3;
        this.f31169g = (ImageView) view.findViewById(C1987R.id.alarm_hide);
        SwitchMaterial switchMaterial = (SwitchMaterial) view.findViewById(C1987R.id.onOff);
        this.f31170h = switchMaterial;
        AlarmRepeatView alarmRepeatView = (AlarmRepeatView) view.findViewById(C1987R.id.repeat);
        this.f31171i = alarmRepeatView;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C1987R.id.fullLine);
        this.f31172j = viewGroup;
        this.f31173k = view.findViewById(C1987R.id.alarm_divider);
        this.f31174l = (ViewGroup) view.findViewById(C1987R.id.expandable_layout);
        this.f31175m = (ViewGroup) view.findViewById(C1987R.id.expandable_static_layout);
        View findViewById = view.findViewById(C1987R.id.alarm_start_date);
        this.f31176n = findViewById;
        View findViewById2 = view.findViewById(C1987R.id.alarm_end_date);
        this.f31177o = findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.alarm_name_container);
        this.f31178p = findViewById3;
        this.f31179q = (TextView) view.findViewById(C1987R.id.alarm_name);
        textView.setOnClickListener(new f(this, 0));
        textView2.setOnClickListener(new androidx.media3.ui.h(this, 1));
        alarmRepeatView.setOnClickListener(new androidx.media3.ui.i(this, 1));
        switchMaterial.setOnClickListener(new com.google.android.material.search.j(this, 1));
        textView3.setOnClickListener(new com.google.android.material.search.k(this, 1));
        view.findViewById(C1987R.id.layout_hide).setOnClickListener(new sg.f(this, 0));
        viewGroup.setOnClickListener(new sg.g(this, 0));
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.withings.alarm.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view2) {
                int year;
                int monthOfYear;
                final l lVar = l.this;
                DateTime t11 = lVar.f31163a.t();
                if (t11 != null) {
                    year = t11.getYear();
                } else {
                    year = DateTime.now().getYear();
                }
                int i11 = year;
                if (t11 != null) {
                    monthOfYear = t11.getMonthOfYear();
                } else {
                    monthOfYear = DateTime.now().getMonthOfYear();
                }
                int i12 = monthOfYear - 1;
                if (t11 == null) {
                    t11 = DateTime.now();
                }
                DatePickerDialog datePickerDialog = new DatePickerDialog(view2.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: com.withings.alarm.ui.i
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i13, int i14, int i15) {
                        l lVar2 = l.this;
                        lVar2.getClass();
                        lVar2.f31163a.D0(new DateTime(i13, i14 + 1, i15, 0, 0));
                        lVar2.f31164b.c1(lVar2.f31163a);
                    }
                }, i11, i12, t11.getDayOfMonth());
                datePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.withings.alarm.ui.j
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        l lVar2 = l.this;
                        lVar2.f31163a.D0(null);
                        lVar2.f31164b.c1(lVar2.f31163a);
                        Toast.makeText(view2.getContext(), "Beta only : Removed startdate from alarm", 0).show();
                    }
                });
                datePickerDialog.setTitle("BETA ONLY : START TIME");
                datePickerDialog.show();
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.withings.alarm.ui.h
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view2) {
                int year;
                int monthOfYear;
                final l lVar = l.this;
                DateTime g11 = lVar.f31163a.g();
                if (g11 != null) {
                    year = g11.getYear();
                } else {
                    year = DateTime.now().getYear();
                }
                int i11 = year;
                if (g11 != null) {
                    monthOfYear = g11.getMonthOfYear();
                } else {
                    monthOfYear = DateTime.now().getMonthOfYear();
                }
                int i12 = monthOfYear - 1;
                if (g11 == null) {
                    g11 = DateTime.now();
                }
                DatePickerDialog datePickerDialog = new DatePickerDialog(view2.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: com.withings.alarm.ui.c
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i13, int i14, int i15) {
                        l lVar2 = l.this;
                        lVar2.getClass();
                        lVar2.f31163a.V(new DateTime(i13, i14 + 1, i15, 0, 0));
                        lVar2.f31164b.c1(lVar2.f31163a);
                    }
                }, i11, i12, g11.getDayOfMonth());
                datePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.withings.alarm.ui.d
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        l lVar2 = l.this;
                        lVar2.f31163a.V(null);
                        lVar2.f31164b.c1(lVar2.f31163a);
                        Toast.makeText(view2.getContext(), "Beta only : Removed enddate from alarm", 0).show();
                    }
                });
                datePickerDialog.setTitle("BETA ONLY : END TIME");
                datePickerDialog.show();
            }
        });
        findViewById3.setOnClickListener(new e(this, 0));
    }

    public static void a(l lVar) {
        lVar.f31164b.u0(lVar.f31163a);
        if (!lVar.f31180r) {
            lVar.m();
        }
    }

    public static void b(l lVar) {
        lVar.f31163a.K(lVar.f31170h.isChecked());
        lVar.f31164b.c1(lVar.f31163a);
        lVar.t();
        if (lVar.f31163a.B()) {
            lVar.f31164b.N0(lVar.f31163a);
        }
    }

    public static void d(l lVar) {
        lVar.f31164b.u0(lVar.f31163a);
    }

    public static void e(l lVar) {
        lVar.f31164b.I(lVar.f31163a);
    }

    private static void h(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), 17432576);
        loadAnimation.setDuration(150L);
        loadAnimation.setAnimationListener(new b(view));
        view.startAnimation(loadAnimation);
    }

    private static void i(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), 17432577);
        loadAnimation.setDuration(150L);
        loadAnimation.setAnimationListener(new c(view));
        view.startAnimation(loadAnimation);
    }

    private void n(boolean z5) {
        int j5 = j(z5);
        ViewGroup viewGroup = this.f31174l;
        ResizeAnimation resizeAnimation = new ResizeAnimation(viewGroup, j5);
        resizeAnimation.setDuration(150L);
        resizeAnimation.setAnimationListener(new a());
        viewGroup.requestLayout();
        viewGroup.startAnimation(resizeAnimation);
    }

    private void t() {
        Context context = this.itemView.getContext();
        boolean D = this.f31163a.D();
        TextView textView = this.f31166d;
        if (!D) {
            textView.setText(this.f31171i.getSummary());
        } else if (!this.f31163a.B()) {
            textView.setText(context.getString(C1987R.string._RMNDR_NEVER_));
        } else {
            DateTime dateTime = new DateTime();
            if ((this.f31163a.k() + (this.f31163a.h() * 60)) - dateTime.getMinuteOfDay() <= 0) {
                textView.setText(context.getString(C1987R.string._TOMORROW_));
            } else {
                textView.setText(context.getString(C1987R.string._TODAY_));
            }
        }
    }

    @Override // com.withings.alarm.ui.AlarmRepeatView.a
    public final void D0(AlarmRepeatView alarmRepeatView, boolean z5) {
        this.f31164b.c1(this.f31163a);
        n(z5);
        t();
    }

    public final void f() {
        int round = Math.round(ah.g.k(0, this.itemView.getContext()));
        ViewGroup viewGroup = this.f31174l;
        ResizeAnimation resizeAnimation = new ResizeAnimation(viewGroup, round);
        resizeAnimation.setDuration(150L);
        viewGroup.startAnimation(resizeAnimation);
        this.f31180r = false;
        int v11 = u.v(C1987R.attr.colorSurface, this.f31179q.getContext());
        ViewGroup viewGroup2 = this.f31172j;
        viewGroup2.setBackgroundColor(v11);
        u0.j0(viewGroup2, ah.g.k(0, this.itemView.getContext()));
        this.f31173k.setVisibility(0);
        h(this.f31166d);
        if (this.f31182t) {
            i(this.f31176n);
        }
        if (this.f31183u) {
            i(this.f31177o);
        }
        i(this.f31168f);
        this.f31169g.animate().rotationBy(180.0f).setDuration(150L).start();
    }

    public final void g() {
        n(this.f31171i.c());
        this.f31180r = true;
        int color = androidx.core.content.a.getColor(this.itemView.getContext(), C1987R.color.textSecondaryInverse);
        ViewGroup viewGroup = this.f31172j;
        viewGroup.setBackgroundColor(color);
        u0.j0(viewGroup, ah.g.k(4, viewGroup.getContext()));
        this.f31173k.setVisibility(8);
        h(this.f31168f);
        if (this.f31182t) {
            h(this.f31176n);
        }
        if (this.f31183u) {
            h(this.f31177o);
        }
        i(this.f31166d);
        this.f31169g.animate().rotationBy(180.0f).setDuration(150L).start();
    }

    public final int j(boolean z5) {
        Context context = this.f31174l.getContext();
        ViewGroup viewGroup = this.f31175m;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH), View.MeasureSpec.makeMeasureSpec(0, 0));
        int k11 = ah.g.k(48, context) + viewGroup.getMeasuredHeight();
        if (z5) {
            return k11 + ah.g.k(48, context);
        }
        return k11;
    }

    public final boolean k() {
        return this.f31180r;
    }

    public final void l(View view) {
        Context context = view.getContext();
        View inflate = View.inflate(context, C1987R.layout.view_edit_name, null);
        EditText editText = (EditText) inflate.findViewById(C1987R.id.edit_text);
        editText.setText(this.f31163a.l());
        editText.setFilters(new InputFilter[]{this.f31184v, new InputFilter.LengthFilter(23)});
        androidx.appcompat.app.c create = new qc.b(context).D(inflate).z(17039370, new k(0, this, editText)).w(17039360, null).create();
        create.getWindow().setSoftInputMode(5);
        create.show();
    }

    public final void m() {
        if (this.f31180r) {
            d dVar = this.f31164b;
            this.f31163a.getClass();
            dVar.p1();
            return;
        }
        this.f31164b.e0(this.f31163a.j());
    }

    @Override // com.withings.alarm.ui.AlarmRepeatView.a
    public final void m0(AlarmRepeatView alarmRepeatView) {
        this.f31166d.post(new androidx.activity.e(this, 3));
        this.f31164b.c1(this.f31163a);
    }

    public void o() {
        boolean z5;
        this.f31163a.F(this.f31165c, this.f31167e);
        this.f31170h.setChecked(this.f31163a.B());
        DeviceAlarm deviceAlarm = this.f31163a;
        AlarmRepeatView alarmRepeatView = this.f31171i;
        boolean z11 = true;
        alarmRepeatView.g(deviceAlarm, true);
        alarmRepeatView.setCallBack(this);
        alarmRepeatView.setSummaryVisible(false);
        e1.d(this.f31178p, this.f31181s);
        if (this.f31182t && this.f31180r) {
            z5 = true;
        } else {
            z5 = false;
        }
        e1.d(this.f31176n, z5);
        if (!this.f31183u || !this.f31180r) {
            z11 = false;
        }
        e1.d(this.f31177o, z11);
        boolean isEmpty = this.f31163a.l().isEmpty();
        TextView textView = this.f31179q;
        if (isEmpty) {
            textView.setTextColor(u.v(16842808, textView.getContext()));
            textView.setText(C1987R.string._NAME_);
        } else {
            textView.setTextColor(u.v(16842806, textView.getContext()));
            textView.setText(this.f31163a.l());
        }
        t();
    }

    public final void p() {
        ViewGroup viewGroup = this.f31174l;
        viewGroup.getLayoutParams().height = ah.g.k(0, this.itemView.getContext());
        viewGroup.invalidate();
        int v11 = u.v(16842801, this.itemView.getContext());
        ViewGroup viewGroup2 = this.f31172j;
        viewGroup2.setBackgroundColor(v11);
        u0.j0(viewGroup2, ah.g.k(0, this.itemView.getContext()));
        this.f31166d.setVisibility(0);
        this.f31168f.setVisibility(8);
        ImageView imageView = this.f31169g;
        imageView.setImageResource(C1987R.drawable.icon_medium_navigation_downsm);
        this.f31173k.setVisibility(0);
        imageView.setRotation(0.0f);
        if (this.f31182t && this.f31183u) {
            this.f31176n.setVisibility(8);
            this.f31177o.setVisibility(8);
        }
        this.f31180r = false;
    }

    public final void q(DeviceAlarm deviceAlarm, boolean z5, boolean z11, boolean z12) {
        this.f31163a = deviceAlarm;
        this.f31181s = z5;
        this.f31182t = z11;
        this.f31183u = z12;
        o();
    }

    public final void r() {
        int j5 = j(!this.f31163a.D());
        ViewGroup viewGroup = this.f31174l;
        viewGroup.getLayoutParams().height = ah.g.k(j5, this.itemView.getContext());
        viewGroup.invalidate();
        int color = androidx.core.content.a.getColor(this.itemView.getContext(), C1987R.color.textSecondaryInverse);
        ViewGroup viewGroup2 = this.f31172j;
        viewGroup2.setBackgroundColor(color);
        u0.j0(viewGroup2, ah.g.k(4, this.itemView.getContext()));
        this.f31166d.setVisibility(8);
        this.f31168f.setVisibility(0);
        if (!this.f31163a.D()) {
            this.f31171i.i();
        }
        ImageView imageView = this.f31169g;
        imageView.setImageResource(C1987R.drawable.icon_medium_navigation_upsm);
        this.f31173k.setVisibility(8);
        imageView.setRotation(0.0f);
        e1.d(this.f31176n, this.f31182t);
        e1.d(this.f31177o, this.f31183u);
        this.f31180r = true;
    }

    public final void s(WsdMultipleAlarmFragment wsdMultipleAlarmFragment) {
        this.f31164b = wsdMultipleAlarmFragment;
    }

    /* compiled from: AlarmViewHolder.java */
    /* loaded from: classes3.dex */
    public final class a implements Animation.AnimationListener {
        a() {
            l.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            l lVar = l.this;
            lVar.f31164b.L0(lVar);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: AlarmViewHolder.java */
    /* loaded from: classes3.dex */
    public final class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View f31186a;

        b(View view) {
            this.f31186a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            this.f31186a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }

    /* compiled from: AlarmViewHolder.java */
    /* loaded from: classes3.dex */
    public final class c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View f31187a;

        c(View view) {
            this.f31187a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.f31187a.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
