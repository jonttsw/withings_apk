package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.withings.design.utils.CustomTextAppearanceSpan;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import fn0.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: TextSelectorView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001e\"B'\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010:\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\bR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010 R*\u0010*\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0004\"\u0004\b)\u0010\bR\u0019\u00100\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R.\u00102\u001a\u0004\u0018\u0001012\b\u0010%\u001a\u0004\u0018\u0001018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006="}, d2 = {"Lcom/withings/design/view/TextSelectorView;", "Landroid/widget/RelativeLayout;", "", "getCurrentPosition", "()I", "position", "Lnm0/y;", "setCurrentPosition", "(I)V", "", "getCurrentText", "()Ljava/lang/String;", "drawableRes", "setLeftDrawable", "setRightDrawable", "Landroidx/viewpager/widget/ViewPager;", "a", "Lnm0/g;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "viewPager", "Landroid/view/View;", com.huawei.hms.feature.dynamic.e.b.f28627a, "getNextButton", "()Landroid/view/View;", "nextButton", "c", "getPreviousButton", "previousButton", "Landroid/widget/ImageView;", "d", "getNextImageView", "()Landroid/widget/ImageView;", "nextImageView", com.huawei.hms.feature.dynamic.e.e.f28630a, "getPreviousImageView", "previousImageView", "value", ConstantsWs.JSON_SESSION_KEY_GCONST, "I", "getTextStyle", "setTextStyle", "textStyle", "Landroid/util/AttributeSet;", "l", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Lcom/withings/design/view/i;", "adapter", "Lcom/withings/design/view/i;", "getAdapter", "()Lcom/withings/design/view/i;", "setAdapter", "(Lcom/withings/design/view/i;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TextSelectorView extends RelativeLayout {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ k[] f36401m = {q0.h(new h0(q0.b(TextSelectorView.class), "viewPager", "getViewPager()Landroidx/viewpager/widget/ViewPager;")), q0.h(new h0(q0.b(TextSelectorView.class), "nextButton", "getNextButton()Landroid/view/View;")), q0.h(new h0(q0.b(TextSelectorView.class), "previousButton", "getPreviousButton()Landroid/view/View;")), q0.h(new h0(q0.b(TextSelectorView.class), "nextImageView", "getNextImageView()Landroid/widget/ImageView;")), q0.h(new h0(q0.b(TextSelectorView.class), "previousImageView", "getPreviousImageView()Landroid/widget/ImageView;"))};

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f36402a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f36403b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f36404c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f36405d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f36406e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f36407f;

    /* renamed from: g  reason: collision with root package name */
    private int f36408g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f36409h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f36410i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f36411j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f36412k;

    /* renamed from: l  reason: collision with root package name */
    private final AttributeSet f36413l;

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void onPageSelected(int i11) {
            TextSelectorView textSelectorView = TextSelectorView.this;
            textSelectorView.b(i11, true, true);
            Iterator it = textSelectorView.f36407f.iterator();
            while (it.hasNext()) {
                textSelectorView.getAdapter();
                ((e) it.next()).a();
            }
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    static final class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k[] kVarArr = TextSelectorView.f36401m;
            TextSelectorView.this.getClass();
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    static final class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k[] kVarArr = TextSelectorView.f36401m;
            TextSelectorView.this.getClass();
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    public final class d extends androidx.viewpager.widget.e {
        public d() {
        }

        @Override // androidx.viewpager.widget.e
        public final void destroyItem(ViewGroup container, int i11, Object anyObject) {
            u.k(container, "container");
            u.k(anyObject, "anyObject");
            container.removeView((View) anyObject);
        }

        @Override // androidx.viewpager.widget.e
        public final int getCount() {
            TextSelectorView.this.getAdapter();
            return 0;
        }

        @Override // androidx.viewpager.widget.e
        public final Object instantiateItem(ViewGroup parent, int i11) {
            u.k(parent, "parent");
            TextSelectorView textSelectorView = TextSelectorView.this;
            textSelectorView.getAdapter();
            TextView textView = new TextView(textSelectorView.getContext());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            Context context = textView.getContext();
            u.f(context, "context");
            spannableStringBuilder.setSpan(new CustomTextAppearanceSpan(context, textSelectorView.getTextStyle()), 0, "".length(), 17);
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            textView.setHeight(parent.getHeight());
            textView.setWidth(parent.getWidth());
            parent.addView(textView);
            return textView;
        }

        @Override // androidx.viewpager.widget.e
        public final boolean isViewFromObject(View view, Object anyObject) {
            u.k(view, "view");
            u.k(anyObject, "anyObject");
            return u.e(view, (TextView) anyObject);
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    public interface e {
        void a();
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.a<View> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return TextSelectorView.this.findViewById(C1987R.id.next_button);
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<ImageView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) TextSelectorView.this.findViewById(C1987R.id.next_image);
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    static final class h extends w implements ym0.a<View> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return TextSelectorView.this.findViewById(C1987R.id.previous_button);
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    static final class i extends w implements ym0.a<ImageView> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) TextSelectorView.this.findViewById(C1987R.id.previous_image);
        }
    }

    /* compiled from: TextSelectorView.kt */
    /* loaded from: classes3.dex */
    static final class j extends w implements ym0.a<ViewPager> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final ViewPager invoke() {
            return (ViewPager) TextSelectorView.this.findViewById(C1987R.id.text_pager);
        }
    }

    public TextSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i11, boolean z5, boolean z11) {
        Drawable drawable;
        boolean z12;
        Drawable drawable2;
        boolean z13 = false;
        if (z5) {
            View previousButton = getPreviousButton();
            if (i11 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            previousButton.setEnabled(z12);
            ImageView previousImageView = getPreviousImageView();
            if (getPreviousButton().isEnabled()) {
                drawable2 = this.f36409h;
                if (drawable2 == null) {
                    u.s("enabledLeftDrawable");
                    throw null;
                }
            } else {
                drawable2 = this.f36410i;
                if (drawable2 == null) {
                    u.s("disabledLeftDrawable");
                    throw null;
                }
            }
            previousImageView.setImageDrawable(drawable2);
        }
        if (z11) {
            View nextButton = getNextButton();
            if (i11 < 0 - 1) {
                z13 = true;
            }
            nextButton.setEnabled(z13);
            ImageView nextImageView = getNextImageView();
            if (getNextButton().isEnabled()) {
                drawable = this.f36411j;
                if (drawable == null) {
                    u.s("enabledRightDrawable");
                    throw null;
                }
            } else {
                drawable = this.f36412k;
                if (drawable == null) {
                    u.s("disabledRightDrawable");
                    throw null;
                }
            }
            nextImageView.setImageDrawable(drawable);
        }
    }

    private final View getNextButton() {
        nm0.g gVar = this.f36403b;
        k kVar = f36401m[1];
        return (View) gVar.getValue();
    }

    private final ImageView getNextImageView() {
        nm0.g gVar = this.f36405d;
        k kVar = f36401m[3];
        return (ImageView) gVar.getValue();
    }

    private final View getPreviousButton() {
        nm0.g gVar = this.f36404c;
        k kVar = f36401m[2];
        return (View) gVar.getValue();
    }

    private final ImageView getPreviousImageView() {
        nm0.g gVar = this.f36406e;
        k kVar = f36401m[4];
        return (ImageView) gVar.getValue();
    }

    private final ViewPager getViewPager() {
        nm0.g gVar = this.f36402a;
        k kVar = f36401m[0];
        return (ViewPager) gVar.getValue();
    }

    public final com.withings.design.view.i getAdapter() {
        return null;
    }

    public final AttributeSet getAttrs() {
        return this.f36413l;
    }

    public final int getCurrentPosition() {
        return getViewPager().getCurrentItem();
    }

    public final String getCurrentText() {
        return "";
    }

    public final int getTextStyle() {
        return this.f36408g;
    }

    public final void setAdapter(com.withings.design.view.i iVar) {
        androidx.viewpager.widget.e adapter = getViewPager().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        b(getViewPager().getCurrentItem(), true, true);
    }

    public final void setCurrentPosition(int i11) {
        getViewPager().setCurrentItem(i11);
    }

    public final void setLeftDrawable(int i11) {
        Context context = getContext();
        Context context2 = getContext();
        u.f(context2, "context");
        int x11 = ah.u.x(context2, C1987R.attr.colorOnSurface);
        Drawable mutate = androidx.core.content.a.getDrawable(context, i11).mutate();
        androidx.core.graphics.drawable.a.l(mutate, x11);
        u.f(mutate, "Drawables.getTintedDrawa…r(R.attr.colorOnSurface))");
        this.f36409h = mutate;
        Context context3 = getContext();
        Context context4 = getContext();
        u.f(context4, "context");
        int x12 = ah.u.x(context4, C1987R.attr.colorSurface);
        Drawable mutate2 = androidx.core.content.a.getDrawable(context3, i11).mutate();
        androidx.core.graphics.drawable.a.l(mutate2, x12);
        u.f(mutate2, "Drawables.getTintedDrawa…lor(R.attr.colorSurface))");
        this.f36410i = mutate2;
        b(getViewPager().getCurrentItem(), true, false);
    }

    public final void setRightDrawable(int i11) {
        Context context = getContext();
        Context context2 = getContext();
        u.f(context2, "context");
        int x11 = ah.u.x(context2, C1987R.attr.colorOnSurface);
        Drawable mutate = androidx.core.content.a.getDrawable(context, i11).mutate();
        androidx.core.graphics.drawable.a.l(mutate, x11);
        u.f(mutate, "Drawables.getTintedDrawa…r(R.attr.colorOnSurface))");
        this.f36411j = mutate;
        Context context3 = getContext();
        Context context4 = getContext();
        u.f(context4, "context");
        int x12 = ah.u.x(context4, C1987R.attr.colorSurface);
        Drawable mutate2 = androidx.core.content.a.getDrawable(context3, i11).mutate();
        androidx.core.graphics.drawable.a.l(mutate2, x12);
        u.f(mutate2, "Drawables.getTintedDrawa…lor(R.attr.colorSurface))");
        this.f36412k = mutate2;
        b(getViewPager().getCurrentItem(), false, true);
    }

    public final void setTextStyle(int i11) {
        this.f36408g = i11;
        androidx.viewpager.widget.e adapter = getViewPager().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSelectorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.k(context, "context");
        this.f36413l = attributeSet;
        this.f36402a = nm0.h.b(new j());
        this.f36403b = nm0.h.b(new f());
        this.f36404c = nm0.h.b(new h());
        this.f36405d = nm0.h.b(new g());
        this.f36406e = nm0.h.b(new i());
        this.f36407f = new ArrayList();
        this.f36408g = C1987R.style.bodyBold;
        View.inflate(context, C1987R.layout.view_text_selector, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72614p);
        setLeftDrawable(obtainStyledAttributes.getResourceId(0, 2131231616));
        setRightDrawable(obtainStyledAttributes.getResourceId(1, 2131231617));
        setTextStyle(obtainStyledAttributes.getResourceId(2, C1987R.style.bodyBold));
        obtainStyledAttributes.recycle();
        getViewPager().setAdapter(new d());
        getViewPager().c(new a());
        getNextButton().setOnClickListener(new b());
        getPreviousButton().setOnClickListener(new c());
    }
}
