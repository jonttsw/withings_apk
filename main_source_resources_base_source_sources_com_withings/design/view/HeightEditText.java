package com.withings.design.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dp0.j;
import java.util.NoSuchElementException;
import k70.b;
import k70.h;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: HeightEditText.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 J\u0017\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0007J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/withings/design/view/HeightEditText;", "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView$OnEditorActionListener;", "", "resId", "Lnm0/y;", "setTitle", "(I)V", "", "measure", "setValue", "(D)V", "Lcom/withings/design/view/HeightEditText$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnDoneListener", "(Lcom/withings/design/view/HeightEditText$a;)V", "optionValue", "setImeOptionValue", "", "errorMessage", "setError", "(Ljava/lang/String;)V", "<set-?>", ConstantsWs.JSON_SESSION_KEY_GCONST, "I", "getUnit", "()I", "setUnit", HealthConstants.FoodIntake.UNIT, "getHeightInMeters", "()D", "heightInMeters", "a", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HeightEditText extends RelativeLayout implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f36228a;

    /* renamed from: b  reason: collision with root package name */
    private final EditText f36229b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f36230c;

    /* renamed from: d  reason: collision with root package name */
    private final EditText f36231d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f36232e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f36233f;

    /* renamed from: g  reason: collision with root package name */
    private int f36234g;

    /* renamed from: h  reason: collision with root package name */
    private int f36235h;

    /* renamed from: i  reason: collision with root package name */
    private double f36236i;

    /* compiled from: HeightEditText.kt */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public HeightEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
    }

    private final void setUnit(int i11) {
        this.f36234g = i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        this.f36229b.clearFocus();
        this.f36231d.clearFocus();
    }

    public final double getHeightInMeters() {
        double parseDouble;
        EditText editText = this.f36229b;
        Editable text = editText.getText();
        u.f(text, "heightEditText.text");
        int i11 = 0;
        if (text.length() == 0) {
            parseDouble = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            parseDouble = Double.parseDouble(j.O(editText.getText().toString(), ",", ".", false));
        }
        int i12 = this.f36234g;
        if (i12 == 6) {
            int i13 = k70.a.f75659c;
            return parseDouble / 100.0d;
        } else if (i12 == 7) {
            EditText editText2 = this.f36231d;
            Editable text2 = editText2.getText();
            u.f(text2, "inchesEditText.text");
            if (text2.length() != 0) {
                i11 = Integer.parseInt(editText2.getText().toString());
            }
            int i14 = k70.b.f75660c;
            return ((((long) parseDouble) * 12) + i11) * 0.0254d;
        } else {
            return parseDouble;
        }
    }

    public final int getUnit() {
        return this.f36234g;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView v11, int i11, KeyEvent event) {
        u.k(v11, "v");
        u.k(event, "event");
        if (i11 == 6 && v11.getId() != C1987R.id.height_edittext) {
            v11.getId();
            return false;
        }
        return false;
    }

    public final void setError(String errorMessage) {
        int i11;
        int i12;
        u.k(errorMessage, "errorMessage");
        boolean z5 = !j.D(errorMessage);
        Context context = getContext();
        u.f(context, "context");
        if (z5) {
            i11 = C1987R.attr.colorError;
        } else {
            i11 = C1987R.attr.colorOnPrimary;
        }
        int color = androidx.core.content.a.getColor(getContext(), ah.u.x(context, i11));
        Drawable background = this.f36229b.getBackground();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        background.setColorFilter(color, mode);
        this.f36231d.getBackground().setColorFilter(color, mode);
        TextView textView = this.f36233f;
        textView.setText(errorMessage);
        if (z5) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        textView.setVisibility(i12);
    }

    public final void setImeOptionValue(int i11) {
        this.f36235h = i11;
        int i12 = this.f36234g;
        EditText editText = this.f36229b;
        if (i12 == 6) {
            editText.setImeOptions(i11 | 268435456);
        } else if (i12 == 7) {
            editText.setImeOptions(268435461);
            this.f36231d.setImeOptions(i11 | 268435456);
        }
    }

    public final void setOnDoneListener(a listener) {
        u.k(listener, "listener");
    }

    public final void setTitle(int i11) {
        this.f36228a.setText(i11);
    }

    public final void setValue(double d11) {
        this.f36236i = d11;
        int i11 = this.f36234g;
        EditText editText = this.f36229b;
        EditText editText2 = this.f36231d;
        if (i11 == 6) {
            editText.setImeOptions(this.f36235h | 268435456);
        } else if (i11 == 7) {
            editText.setImeOptions(268435461);
            editText2.setImeOptions(this.f36235h | 268435456);
        }
        int i12 = this.f36234g;
        TextView textView = this.f36230c;
        String str = "";
        TextView textView2 = this.f36232e;
        if (i12 == 6) {
            textView2.setVisibility(8);
            editText2.setVisibility(8);
            if (this.f36236i > 0) {
                h.a aVar = k70.h.f75667b;
                int i13 = this.f36234g;
                aVar.getClass();
                for (k70.h hVar : x.W(new k70.h(6), new k70.h(7))) {
                    if (hVar.d() == i13) {
                        Context context = getContext();
                        u.f(context, "context");
                        str = hVar.b(context, this.f36236i);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            editText.setText(str);
            textView.setText(getContext().getString(C1987R.string._CM_));
        } else if (i12 == 7) {
            textView.setText(getContext().getString(C1987R.string._FT_));
            textView2.setText(getContext().getString(C1987R.string._IN_));
            textView2.setVisibility(0);
            editText2.setVisibility(0);
            double d12 = this.f36236i;
            if (d12 <= 0) {
                editText.setText("");
                editText2.setText("");
                return;
            }
            int i14 = k70.b.f75660c;
            b.C1165b a11 = b.a.a(d12);
            editText.setText(String.valueOf(a11.f75661a));
            editText2.setText(String.valueOf(a11.f75662b));
        }
    }

    public HeightEditText(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HeightEditText(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto L6
            r4 = r0
        L6:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.u.k(r2, r5)
            r1.<init>(r2, r3, r4, r0)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131560180(0x7f0d06f4, float:1.8745725E38)
            r2.inflate(r3, r1)
            r2 = 2131364167(0x7f0a0947, float:1.8348163E38)
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.title)"
            kotlin.jvm.internal.u.f(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f36228a = r2
            r2 = 2131362984(0x7f0a04a8, float:1.8345764E38)
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.height_edittext)"
            kotlin.jvm.internal.u.f(r2, r3)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.f36229b = r2
            r3 = 2131362989(0x7f0a04ad, float:1.8345774E38)
            android.view.View r3 = r1.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.height_unit)"
            kotlin.jvm.internal.u.f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.f36230c = r3
            r3 = 2131362986(0x7f0a04aa, float:1.8345768E38)
            android.view.View r3 = r1.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.height_in_inches_edittext)"
            kotlin.jvm.internal.u.f(r3, r4)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r1.f36231d = r3
            r4 = 2131363073(0x7f0a0501, float:1.8345945E38)
            android.view.View r4 = r1.findViewById(r4)
            java.lang.String r5 = "findViewById(R.id.inch_unit)"
            kotlin.jvm.internal.u.f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f36232e = r4
            r4 = 2131362985(0x7f0a04a9, float:1.8345766E38)
            android.view.View r4 = r1.findViewById(r4)
            java.lang.String r5 = "findViewById(R.id.height_error)"
            kotlin.jvm.internal.u.f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f36233f = r4
            r2.setOnEditorActionListener(r1)
            r3.setOnEditorActionListener(r1)
            android.content.Context r4 = r1.getContext()
            r5 = 2131099899(0x7f0600fb, float:1.7812164E38)
            int r4 = androidx.core.content.a.getColor(r4, r5)
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r4, r5)
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            r2.setColorFilter(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.design.view.HeightEditText.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
