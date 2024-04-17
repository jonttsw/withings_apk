package com.withings.wiscale2.measure.accountmeasure.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import dp0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
/* compiled from: FatMassView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/FatMassView;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/WeightView;", "", "value", "Lnm0/y;", "setValue", "(D)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FatMassView extends WeightView {

    /* renamed from: l  reason: collision with root package name */
    private boolean f58076l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FatMassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u.j(context, "context");
        this.f58076l = i.b().e().C();
        setType(8);
    }

    public final Measure j(Measure weight) {
        int i11;
        boolean z5;
        u.j(weight, "weight");
        if (this.f58076l) {
            try {
                double parseDouble = Double.parseDouble(j.O(getBinding().f99252d.getText().toString(), ",", ".", false));
                Measure measure = new Measure();
                measure.setType(8);
                measure.setUnit(-3);
                measure.setValue(an0.a.a(((weight.f95794y * parseDouble) / 100) * 1000));
                return measure;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        String obj = getBinding().f99252d.getText().toString();
        int length = obj.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length) {
            if (!z11) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (u.l(obj.charAt(i11), 32) <= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z11) {
                if (!z5) {
                    z11 = true;
                } else {
                    i12++;
                }
            } else if (!z5) {
                break;
            } else {
                length--;
            }
        }
        if (obj.subSequence(i12, length + 1).toString().length() == 0 || Double.parseDouble(j.O(getBinding().f99252d.getText().toString(), ",", ".", false)) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return super.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r12 <= 100.0d) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r12 >= com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r0.f95794y < r15.f95794y) goto L38;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(com.withings.library.measure.Measure r15) {
        /*
            r14 = this;
            java.lang.String r0 = "weight"
            kotlin.jvm.internal.u.j(r15, r0)
            com.withings.library.measure.Measure r0 = r14.j(r15)
            r1 = 1
            if (r0 != 0) goto Le
            goto Lb0
        Le:
            double r2 = r15.getValue()
            tb0.j4 r4 = r14.getBinding()
            android.widget.EditText r4 = r4.f99252d
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            tb0.j4 r5 = r14.getBinding()
            android.widget.EditText r5 = r5.f99249a
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r6 = 0
            int r7 = r4.length()     // Catch: java.lang.NumberFormatException -> Laf
            java.lang.String r8 = "."
            java.lang.String r9 = ","
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r7 <= 0) goto L44
            java.lang.String r4 = dp0.j.O(r4, r9, r8, r6)     // Catch: java.lang.NumberFormatException -> Laf
            double r12 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.NumberFormatException -> Laf
            goto L45
        L44:
            r12 = r10
        L45:
            int r4 = r5.length()     // Catch: java.lang.NumberFormatException -> Laf
            if (r4 <= 0) goto L53
            java.lang.String r4 = dp0.j.O(r5, r9, r8, r6)     // Catch: java.lang.NumberFormatException -> Laf
            double r10 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.NumberFormatException -> Laf
        L53:
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 > 0) goto Laf
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L5c
            goto Laf
        L5c:
            boolean r2 = r14.f58076l
            r3 = 0
            if (r2 == 0) goto L6d
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 > 0) goto Laf
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto Laf
            goto La6
        L6d:
            com.withings.wiscale2.measure.accountmeasure.ui.a r2 = new com.withings.wiscale2.measure.accountmeasure.ui.a
            r5 = 2
            r7 = 0
            r2.<init>(r5, r7)
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.runBlocking$default(r7, r2, r1, r7)
            l70.v r2 = (l70.v) r2
            int r2 = r2.e()
            if (r2 == r5) goto L8d
            r5 = 14
            if (r2 == r5) goto L85
            goto L99
        L85:
            int r2 = l70.t.f78812e
            long r7 = (long) r10
            double r12 = l70.t.a.b(r7, r12)
            goto L99
        L8d:
            int r2 = k70.f.f75665c
            r2 = 1092616192(0x41200000, float:10.0)
            double r7 = (double) r2
            double r12 = r12 * r7
            r7 = 4601842806966618872(0x3fdd07a6bd6e8af8, double:0.453592)
            double r12 = r12 * r7
        L99:
            r7 = 4643985272004935680(0x4072c00000000000, double:300.0)
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 >= 0) goto Laf
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 < 0) goto Laf
        La6:
            double r2 = r0.f95794y
            double r4 = r15.f95794y
            int r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r15 >= 0) goto Laf
            goto Lb0
        Laf:
            r1 = r6
        Lb0:
            if (r1 == 0) goto Lb6
            r14.e()
            goto Lb9
        Lb6:
            r14.g()
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.accountmeasure.ui.FatMassView.k(com.withings.library.measure.Measure):boolean");
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.WeightView, com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public void setValue(double d11) {
        if (this.f58076l) {
            getBinding().f99251c.setText("%");
        }
        super.setValue(d11);
    }
}
