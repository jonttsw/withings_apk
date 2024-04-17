package com.withings.wiscale2.dashboard.item.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.b0;
import androidx.camera.camera2.internal.r2;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.dashboard.item.model.d;
import com.withings.wiscale2.spo2.m;
import fl.p;
import java.util.Arrays;
import java.util.Locale;
import jm.a;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: BaseSummaryItemView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u001c\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\n \u0017*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R#\u0010&\u001a\n \u0017*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R#\u0010)\u001a\n \u0017*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010 R#\u0010,\u001a\n \u0017*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010 R#\u0010/\u001a\n \u0017*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010 R#\u00102\u001a\n \u0017*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010 R\u001b\u00107\u001a\u0002038DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0019\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0019\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/withings/wiscale2/dashboard/item/model/BaseSummaryItemView;", "Lcom/withings/wiscale2/dashboard/item/model/d;", "Data", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "category", "Lnm0/y;", "setCategory", "(Ljava/lang/String;)V", "", "valueAsText", "setValue", "(Ljava/lang/CharSequence;)V", "", "textAppearanceRes", "setValueTextAppearance", "(I)V", "t", "I", "getCardViewCiId", "()I", "cardViewCiId", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "u", "Lnm0/g;", "getGlyphView", "()Landroid/widget/ImageView;", "glyphView", "Landroid/widget/TextView;", ConstantsWs.JSON_SESSION_KEY_VALUE, "getGlyphTextView", "()Landroid/widget/TextView;", "glyphTextView", "Landroidx/compose/ui/platform/ComposeView;", ConstantsWs.JSON_SESSION_KEY_WEIGHTUNIT, "getGoalRingView", "()Landroidx/compose/ui/platform/ComposeView;", "goalRingView", "x", "getCategoryView", "categoryView", "y", "getDateView", "dateView", "z", "getValueView", "valueView", "A", "getEmptyStateTextView", "emptyStateTextView", "Lkn/e;", "B", "getDeviceManager", "()Lkn/e;", "deviceManager", "Lfl/p;", "F", "getHmDeviceModelFactory", "()Lfl/p;", "hmDeviceModelFactory", "Ljm/a;", "G", "getMeasureFormatter", "()Ljm/a;", "measureFormatter", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class BaseSummaryItemView<Data extends com.withings.wiscale2.dashboard.item.model.d> extends ConstraintLayout {
    private static final int[] M = {C1987R.color.statusBad, C1987R.color.statusModerate, C1987R.color.statusGood, C1987R.color.statusUndefined};
    private final nm0.g A;
    private final nm0.g B;
    private final nm0.g F;
    private final nm0.g G;

    /* renamed from: t  reason: collision with root package name */
    private final int f50543t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f50544u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f50545v;

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f50546w;

    /* renamed from: x  reason: collision with root package name */
    private final nm0.g f50547x;

    /* renamed from: y  reason: collision with root package name */
    private final nm0.g f50548y;

    /* renamed from: z  reason: collision with root package name */
    private final nm0.g f50549z;

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseSummaryItemView<Data> f50550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BaseSummaryItemView<Data> baseSummaryItemView) {
            super(0);
            this.f50550a = baseSummaryItemView;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50550a.findViewById(C1987R.id.category);
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseSummaryItemView<Data> f50551a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BaseSummaryItemView<Data> baseSummaryItemView) {
            super(0);
            this.f50551a = baseSummaryItemView;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50551a.findViewById(C1987R.id.date);
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<kn.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f50552a = new w(0);

        @Override // ym0.a
        public final kn.e invoke() {
            return kn.e.c();
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseSummaryItemView<Data> f50553a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BaseSummaryItemView<Data> baseSummaryItemView) {
            super(0);
            this.f50553a = baseSummaryItemView;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50553a.findViewById(C1987R.id.empty_state_text);
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseSummaryItemView<Data> f50554a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(BaseSummaryItemView<Data> baseSummaryItemView) {
            super(0);
            this.f50554a = baseSummaryItemView;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50554a.findViewById(C1987R.id.glyph_text);
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class f extends w implements ym0.a<ImageView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseSummaryItemView<Data> f50555a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(BaseSummaryItemView<Data> baseSummaryItemView) {
            super(0);
            this.f50555a = baseSummaryItemView;
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) this.f50555a.findViewById(C1987R.id.glyph);
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class g extends w implements ym0.a<ComposeView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseSummaryItemView<Data> f50556a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(BaseSummaryItemView<Data> baseSummaryItemView) {
            super(0);
            this.f50556a = baseSummaryItemView;
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            return (ComposeView) this.f50556a.findViewById(C1987R.id.goal_ring);
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class h extends w implements ym0.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f50557a = new w(0);

        @Override // ym0.a
        public final p invoke() {
            return p.f67672b.a();
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class i extends w implements ym0.a<jm.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f50558a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context) {
            super(0);
            this.f50558a = context;
        }

        @Override // ym0.a
        public final jm.a invoke() {
            return a.d.a(this.f50558a);
        }
    }

    /* compiled from: BaseSummaryItemView.kt */
    /* loaded from: classes4.dex */
    static final class j extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseSummaryItemView<Data> f50559a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(BaseSummaryItemView<Data> baseSummaryItemView) {
            super(0);
            this.f50559a = baseSummaryItemView;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50559a.findViewById(C1987R.id.value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseSummaryItemView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, 0, i11);
        u.j(context, "context");
    }

    private final TextView getCategoryView() {
        return (TextView) this.f50547x.getValue();
    }

    private final TextView getDateView() {
        return (TextView) this.f50548y.getValue();
    }

    private final TextView getEmptyStateTextView() {
        return (TextView) this.A.getValue();
    }

    private final TextView getGlyphTextView() {
        return (TextView) this.f50545v.getValue();
    }

    private final ImageView getGlyphView() {
        return (ImageView) this.f50544u.getValue();
    }

    private final ComposeView getGoalRingView() {
        return (ComposeView) this.f50546w.getValue();
    }

    private final TextView getValueView() {
        return (TextView) this.f50549z.getValue();
    }

    public final void A(long j5, boolean z5) {
        String abstractDateTime;
        DateTime dateTime = new DateTime(j5);
        if (j5 == 0) {
            getDateView().setText(m.h(this, C1987R.string._NO_DATA_YET_));
            getDateView().setVisibility(0);
        } else if (DateTime.now().isBefore(dateTime.plusMinutes(1))) {
            getDateView().setText(m.h(this, C1987R.string._JUST_NOW_));
            getDateView().setVisibility(0);
        } else if (b0.t(dateTime)) {
            DateTime dateTime2 = new DateTime(j5);
            Context context = getContext();
            u.i(context, "getContext(...)");
            Duration duration = new Duration(dateTime2, DateTime.now());
            if (dateTime2.isAfterNow()) {
                Fail.j("Date parameter is after now !: " + dateTime2);
                String string = context.getString(C1987R.string._DATE_MMM_D_YYYY_);
                u.i(string, "getString(...)");
                abstractDateTime = String.format(string, Arrays.copyOf(new Object[]{dateTime2}, 1));
            } else if (duration.getStandardMinutes() < 1) {
                abstractDateTime = context.getString(C1987R.string._JUST_NOW_);
                u.i(abstractDateTime, "getString(...)");
            } else if (duration.getStandardHours() < 1) {
                String string2 = context.getString(C1987R.string.__d_MINUTES_AGO_);
                u.i(string2, "getString(...)");
                abstractDateTime = String.format(string2, Arrays.copyOf(new Object[]{Long.valueOf(duration.getStandardMinutes())}, 1));
            } else if (duration.getStandardDays() < 1) {
                String string3 = context.getString(C1987R.string.__d_HOURS_AGO_);
                u.i(string3, "getString(...)");
                abstractDateTime = String.format(string3, Arrays.copyOf(new Object[]{Long.valueOf(duration.getStandardHours())}, 1));
            } else {
                DateTime plusDays = dateTime2.plusDays(1);
                u.i(plusDays, "plusDays(...)");
                if (hn.a.g(plusDays)) {
                    abstractDateTime = context.getString(C1987R.string._YESTERDAY_);
                    u.i(abstractDateTime, "getString(...)");
                } else if (duration.getStandardDays() < 7) {
                    String string4 = context.getString(C1987R.string.__d_DAYS_AGO_);
                    u.i(string4, "getString(...)");
                    abstractDateTime = String.format(string4, Arrays.copyOf(new Object[]{Long.valueOf(duration.getStandardDays())}, 1));
                } else if (b50.b.C(dateTime2)) {
                    abstractDateTime = dateTime2.toString(context.getString(C1987R.string._DATE_MMM_D_));
                    u.i(abstractDateTime, "toString(...)");
                } else {
                    abstractDateTime = dateTime2.toString(context.getString(C1987R.string._DATE_MMM_D_YYYY_));
                    u.i(abstractDateTime, "toString(...)");
                }
            }
            B(abstractDateTime, z5);
        } else {
            DateTime plusDays2 = dateTime.plusDays(1);
            u.i(plusDays2, "plusDays(...)");
            if (b0.t(plusDays2)) {
                B(m.h(this, C1987R.string._YESTERDAY_), z5);
                return;
            }
            Context context2 = getContext();
            u.i(context2, "getContext(...)");
            B(b50.b.i(context2, dateTime), z5);
        }
    }

    public final void B(String dateAsString, boolean z5) {
        String valueOf;
        u.j(dateAsString, "dateAsString");
        TextView dateView = getDateView();
        if (z5) {
            Object[] objArr = new Object[2];
            objArr[0] = m.h(this, C1987R.string._LAST_SYNC_);
            if (dateAsString.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = dateAsString.charAt(0);
                Locale locale = Locale.getDefault();
                u.i(locale, "getDefault(...)");
                String valueOf2 = String.valueOf(charAt);
                u.h(valueOf2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = valueOf2.toLowerCase(locale);
                u.i(lowerCase, "toLowerCase(...)");
                dateAsString = androidx.appcompat.view.menu.d.e(sb2, lowerCase, dateAsString, 1, "substring(...)");
            }
            objArr[1] = dateAsString;
            dateAsString = String.format("%s %s", Arrays.copyOf(objArr, 2));
        } else if (dateAsString.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            char charAt2 = dateAsString.charAt(0);
            if (Character.isLowerCase(charAt2)) {
                valueOf = r2.a("getDefault(...)", charAt2);
            } else {
                valueOf = String.valueOf(charAt2);
            }
            dateAsString = androidx.appcompat.view.menu.d.e(sb3, valueOf, dateAsString, 1, "substring(...)");
        }
        dateView.setText(dateAsString);
        getDateView().setVisibility(0);
    }

    public abstract void C(com.withings.wiscale2.dashboard.item.model.c cVar);

    public abstract void D(com.withings.wiscale2.dashboard.item.model.c cVar);

    public final int getCardViewCiId() {
        return this.f50543t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kn.e getDeviceManager() {
        Object value = this.B.getValue();
        u.i(value, "getValue(...)");
        return (kn.e) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final p getHmDeviceModelFactory() {
        return (p) this.F.getValue();
    }

    protected final jm.a getMeasureFormatter() {
        return (jm.a) this.G.getValue();
    }

    public final void setCategory(String category) {
        u.j(category, "category");
        getCategoryView().setText(category);
        getCategoryView().setVisibility(0);
    }

    public final void setValue(CharSequence valueAsText) {
        u.j(valueAsText, "valueAsText");
        getValueView().setText(valueAsText);
        getValueView().setVisibility(0);
    }

    public final void setValueTextAppearance(int i11) {
        getValueView().setTextAppearance(i11);
    }

    public final void u() {
        getEmptyStateTextView().setVisibility(4);
        getGoalRingView().setVisibility(4);
        getCategoryView().setVisibility(4);
        getCategoryView().setText("");
        getDateView().setVisibility(4);
        getDateView().setText("");
        getValueView().setVisibility(4);
        getValueView().setText("");
        getGlyphView().setVisibility(4);
        getGlyphTextView().setText("");
        getGlyphTextView().setVisibility(4);
        setOnClickListener(null);
    }

    public final void v() {
        CharSequence text = getResources().getText(C1987R.string._START_TRACKING_YOUR_FOOD_);
        u.i(text, "getText(...)");
        getEmptyStateTextView().setText(text);
        getEmptyStateTextView().setVisibility(0);
        x(C1987R.drawable.ic_rounded_food2, C1987R.color.statusInfo);
    }

    public final void w(int i11) {
        getDateView().setText(C1987R.string._NO_DATA_YET_);
        getDateView().setVisibility(0);
        x(i11, C1987R.color.statusInfo);
    }

    public final void x(int i11, int i12) {
        int i13;
        getGlyphView().setVisibility(0);
        getGlyphTextView().setVisibility(4);
        Integer valueOf = Integer.valueOf(i12);
        y yVar = null;
        if (!l.l(M, i12)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int b10 = androidx.health.connect.client.units.d.b(intValue);
            ImageView glyphView = getGlyphView();
            Context context = getContext();
            u.i(context, "getContext(...)");
            glyphView.setBackground(y70.a.c(C1987R.drawable.white_circle, context, androidx.core.content.a.getColor(getGlyphTextView().getContext(), intValue)));
            yVar = y.f85009a;
            i13 = b10;
        } else {
            i13 = C1987R.color.onActionSecondary;
        }
        if (yVar == null) {
            getGlyphView().setBackgroundResource(C1987R.drawable.background_1_circle);
        }
        ImageView glyphView2 = getGlyphView();
        Context context2 = getContext();
        u.i(context2, "getContext(...)");
        glyphView2.setImageDrawable(y70.a.a(i11, context2, i13));
        getGlyphView().setVisibility(0);
    }

    public final void y(int i11, float f11, float f12) {
        ComposeView goalRingView = getGoalRingView();
        u.i(goalRingView, "<get-goalRingView>(...)");
        goalRingView.setVisibility(0);
        getGoalRingView().setContent(new s1.a(true, 2087904647, new com.withings.wiscale2.dashboard.item.model.b(i11, f11, f12)));
    }

    public abstract void z(User user, Data data);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSummaryItemView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f50543t = i12;
        this.f50544u = nm0.h.b(new f(this));
        this.f50545v = nm0.h.b(new e(this));
        this.f50546w = nm0.h.b(new g(this));
        this.f50547x = nm0.h.b(new a(this));
        this.f50548y = nm0.h.b(new b(this));
        this.f50549z = nm0.h.b(new j(this));
        this.A = nm0.h.b(new d(this));
        this.B = nm0.h.b(c.f50552a);
        this.F = nm0.h.b(h.f50557a);
        this.G = nm0.h.b(new i(context));
        LayoutInflater.from(context).inflate(C1987R.layout.list_item_summary_value, this);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1987R.dimen.layout1);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C1987R.dimen.horizontalMargin);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
    }

    public void t(com.withings.wiscale2.dashboard.item.model.c cVar) {
    }
}
