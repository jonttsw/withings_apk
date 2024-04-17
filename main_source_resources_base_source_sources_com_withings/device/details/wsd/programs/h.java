package com.withings.device.details.wsd.programs;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.model.WsdProgramElement;
import com.withings.device.details.wsd.programs.d;
import com.withings.views.view.CircleProgressView;
import com.withings.webradio.WebRadios;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import kotlin.jvm.internal.u;
import tn.i;
import un.l;
import un.n;
import un.o;
/* compiled from: WsdViewHolderProgram.kt */
/* loaded from: classes3.dex */
public final class h extends l {

    /* renamed from: a  reason: collision with root package name */
    private final i f37181a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a f37182b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37183c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37184d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(tn.i r3, com.withings.device.details.wsd.programs.d.a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.u.j(r4, r0)
            android.widget.LinearLayout r0 = r3.b()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            r2.<init>(r0)
            r2.f37181a = r3
            r2.f37182b = r4
            r3 = 1
            r2.f37184d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.wsd.programs.h.<init>(tn.i, com.withings.device.details.wsd.programs.d$a):void");
    }

    public static void b(h this$0, com.withings.alarm.model.b wsdProgramHolder) {
        u.j(this$0, "this$0");
        u.j(wsdProgramHolder, "$wsdProgramHolder");
        this$0.f37182b.u2(this$0, wsdProgramHolder);
    }

    public static void c(h this$0, WsdProgram wsdProgram) {
        u.j(this$0, "this$0");
        if (this$0.f37184d) {
            u.g(wsdProgram);
            this$0.f37182b.R0(this$0, wsdProgram);
        }
    }

    @Override // un.l
    public final void a(WsdProgramElement wsdProgramElement) {
        boolean z5;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        boolean z14;
        com.withings.alarm.model.b bVar = (com.withings.alarm.model.b) wsdProgramElement;
        WsdProgram d11 = bVar.d();
        if (d11 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f37184d = z5;
        if (d11 != null && d11.s()) {
            if (!d11.o() && !d11.p()) {
                z14 = false;
            } else {
                z14 = true;
            }
            this.f37184d = z14;
        }
        i iVar = this.f37181a;
        iVar.b().setOnClickListener(new n(0, this, bVar));
        if (d11 != null && d11.r()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d11 != null && d11.q()) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = this.f37183c;
        View view = iVar.f100346g;
        if (!z15 && z12) {
            CircleProgressView circleProgressView = (CircleProgressView) view;
            circleProgressView.setVisibility(0);
            circleProgressView.setGoal(100.0f);
            circleProgressView.setProgress(0.0f);
            circleProgressView.a(100.0f, WebRadios.PREVIEW_DELAY);
        }
        int i13 = 4;
        if (!z12) {
            CircleProgressView circleProgressView2 = (CircleProgressView) view;
            circleProgressView2.setVisibility(4);
            circleProgressView2.setProgress(0.0f);
        }
        View view2 = iVar.f100344e;
        View view3 = iVar.f100342c;
        TextView textView = iVar.f100340a;
        View view4 = iVar.f100345f;
        View view5 = iVar.f100343d;
        if (z11) {
            int color = androidx.core.content.a.getColor(iVar.b().getContext(), C1987R.color.datavizMonochromaticNeutral5);
            ((LinearLayout) view3).setBackgroundColor(androidx.core.content.a.getColor(iVar.b().getContext(), 17170443));
            TextView textView2 = (TextView) view2;
            textView2.setVisibility(0);
            textView2.setTextColor(color);
            ((TextView) view5).setTextColor(color);
            textView.setTextColor(color);
            ((TextView) view4).setTextColor(color);
        } else {
            int color2 = androidx.core.content.a.getColor(iVar.b().getContext(), 17170443);
            ((LinearLayout) view3).setBackgroundColor(0);
            ((TextView) view2).setVisibility(4);
            ((TextView) view5).setTextColor(color2);
            textView.setTextColor(color2);
            ((TextView) view4).setTextColor(color2);
        }
        this.f37183c = z12;
        String c11 = bVar.c(iVar.b().getContext());
        u.i(c11, "getTitle(...)");
        textView.setText(c11);
        TextView textView3 = (TextView) view5;
        boolean z16 = this.f37184d;
        if (z16 && this.f37183c) {
            i11 = C1987R.string.glyph_stop;
        } else if (z16) {
            i11 = C1987R.string.glyph_play;
        } else {
            i11 = C1987R.string.glyph_plus;
        }
        textView3.setText(i11);
        ProgressBar progressBar = (ProgressBar) iVar.f100347h;
        progressBar.setMax(100);
        if (d11 != null) {
            progressBar.setProgress(d11.g());
            ((TextView) view4).setText(String.format("(%d%%)", Arrays.copyOf(new Object[]{Short.valueOf(d11.g())}, 1)));
        }
        if (d11 != null && d11.g() != 0 && d11.g() != 100) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z17 = true ^ z13;
        if (z17) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        progressBar.setVisibility(i12);
        TextView progressText = (TextView) view4;
        u.i(progressText, "progressText");
        if (!z17) {
            i13 = 0;
        }
        progressText.setVisibility(i13);
        textView3.setOnClickListener(new o(0, this, d11));
    }
}
