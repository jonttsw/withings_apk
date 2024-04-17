package com.withings.ecg.player;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.h;
import androidx.transition.AutoTransition;
import androidx.transition.w;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import jq.l;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import qq.c;
/* compiled from: PlayerView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/withings/ecg/player/PlayerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isEndAnimation", "Lnm0/y;", "setButtonPlayState", "(Z)V", "Lcom/withings/ecg/graph/EcgLineChart;", "graph", "setGraph", "(Lcom/withings/ecg/graph/EcgLineChart;)V", "Lcom/withings/ecg/player/PlayerView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPlayerViewAnimationListener", "(Lcom/withings/ecg/player/PlayerView$a;)V", "Landroid/util/AttributeSet;", "t", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PlayerView extends ConstraintLayout {
    private c A;
    private boolean B;
    private int F;

    /* renamed from: t  reason: collision with root package name */
    private final AttributeSet f38838t;

    /* renamed from: u  reason: collision with root package name */
    private ConstraintLayout f38839u;

    /* renamed from: v  reason: collision with root package name */
    private ImageView f38840v;

    /* renamed from: w  reason: collision with root package name */
    private a f38841w;

    /* renamed from: x  reason: collision with root package name */
    private androidx.constraintlayout.widget.b f38842x;

    /* renamed from: y  reason: collision with root package name */
    private androidx.constraintlayout.widget.b f38843y;

    /* renamed from: z  reason: collision with root package name */
    private qq.b f38844z;

    /* compiled from: PlayerView.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u.j(context, "context");
        this.f38838t = attributeSet;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f74774a);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.F = obtainStyledAttributes.getInt(29, 0);
        y yVar = y.f85009a;
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.player_view, this);
        View findViewById = inflate.findViewById(C1987R.id.root);
        u.i(findViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        this.f38839u = constraintLayout;
        View findViewById2 = inflate.findViewById(C1987R.id.player_view_button);
        u.i(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        this.f38840v = imageView;
        View findViewById3 = inflate.findViewById(C1987R.id.player_view_background);
        u.i(findViewById3, "findViewById(...)");
        ((ImageView) findViewById3).setClipToOutline(true);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.k(constraintLayout);
        this.f38842x = bVar;
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        androidx.constraintlayout.widget.b bVar3 = this.f38842x;
        if (bVar3 != null) {
            bVar2.l(bVar3);
            bVar2.j(C1987R.id.player_view_background, 1);
            bVar2.j(C1987R.id.player_view_background, 3);
            bVar2.o(C1987R.id.player_view_background, 2, 0, 2, (int) getResources().getDimension(C1987R.dimen.keyline_1));
            bVar2.o(C1987R.id.player_view_background, 4, 0, 4, (int) getResources().getDimension(C1987R.dimen.keyline_1));
            bVar2.r(C1987R.id.player_view_background);
            this.f38843y = bVar2;
            if (this.F == 1) {
                this.f38842x = bVar2;
                bVar2.e(constraintLayout);
            }
            imageView.setOnClickListener(new h(this, 4));
            return;
        }
        u.s("playButtonConstraintSet");
        throw null;
    }

    private final void setButtonPlayState(boolean z5) {
        this.f38840v.setImageResource(C1987R.drawable.icon_medium_navigation_playerplay);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.E(250L);
        if (z5) {
            qq.b bVar = this.f38844z;
            if (bVar != null) {
                autoTransition.M(bVar);
            } else {
                u.s("endPlayAnimationListener");
                throw null;
            }
        } else {
            c cVar = this.A;
            if (cVar != null) {
                autoTransition.M(cVar);
            } else {
                u.s("pauseAnimationListener");
                throw null;
            }
        }
        ConstraintLayout constraintLayout = this.f38839u;
        w.a(constraintLayout, autoTransition);
        androidx.constraintlayout.widget.b bVar2 = this.f38842x;
        if (bVar2 != null) {
            bVar2.e(constraintLayout);
        } else {
            u.s("playButtonConstraintSet");
            throw null;
        }
    }

    public static void t(PlayerView this$0) {
        u.j(this$0, "this$0");
        if (this$0.B) {
            this$0.B = false;
            this$0.setButtonPlayState(false);
            return;
        }
        this$0.B = true;
        this$0.f38840v.setImageResource(C1987R.drawable.icon_medium_navigation_playerpause);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.E(250L);
        autoTransition.M(new com.withings.ecg.player.a(this$0));
        ConstraintLayout constraintLayout = this$0.f38839u;
        w.a(constraintLayout, autoTransition);
        androidx.constraintlayout.widget.b bVar = this$0.f38843y;
        if (bVar != null) {
            bVar.e(constraintLayout);
        } else {
            u.s("pauseButtonConstraintSet");
            throw null;
        }
    }

    public final AttributeSet getAttrs() {
        return this.f38838t;
    }

    public final void setGraph(EcgLineChart graph) {
        u.j(graph, "graph");
        this.f38844z = new qq.b(graph);
        this.A = new c(graph);
    }

    public final void setPlayerViewAnimationListener(a listener) {
        u.j(listener, "listener");
        this.f38841w = listener;
    }

    public final void v() {
        this.B = false;
        setButtonPlayState(true);
    }
}
