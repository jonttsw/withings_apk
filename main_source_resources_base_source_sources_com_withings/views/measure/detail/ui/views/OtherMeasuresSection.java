package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.v0;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.view.SectionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import nm0.y;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import sg.c;
/* compiled from: OtherMeasuresSection.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/OtherMeasuresSection;", "Landroid/widget/LinearLayout;", "", "title", "Lnm0/y;", "setTitle", "(Ljava/lang/String;)V", "Lkotlin/Function0;", AMPExtension.Action.ATTRIBUTE_NAME, "setOnClickOnOther", "(Lym0/a;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OtherMeasuresSection extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f46479e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f46480a;

    /* renamed from: b  reason: collision with root package name */
    private final LineCellView f46481b;

    /* renamed from: c  reason: collision with root package name */
    private final SectionView f46482c;

    /* renamed from: d  reason: collision with root package name */
    private j<String, String> f46483d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OtherMeasuresSection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final <X> void a(List<? extends X> list, androidx.recyclerview.widget.u<X, ? extends RecyclerView.z> uVar) {
        int i11;
        String format;
        u.j(list, "list");
        int i12 = 8;
        if (!list.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        if (list.isEmpty()) {
            return;
        }
        this.f46480a.setAdapter(uVar);
        uVar.submitList(x.H0(list, 3));
        int size = list.size() - 3;
        j<String, String> jVar = this.f46483d;
        if (size == 1) {
            format = jVar.c();
        } else {
            format = String.format(jVar.d(), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
        }
        LineCellView lineCellView = this.f46481b;
        lineCellView.setLabel(format);
        if (size > 0) {
            i12 = 0;
        }
        lineCellView.setVisibility(i12);
    }

    public final void setOnClickOnOther(ym0.a<y> action) {
        u.j(action, "action");
        this.f46481b.setOnClickListener(new c(action, 5));
    }

    public final void setTitle(String str) {
        this.f46482c.setTitle(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherMeasuresSection(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        String string = context.getString(C1987R.string.section_moreMeasurements_single);
        this.f46483d = new j<>(string, v0.c(string, "getString(...)", context, C1987R.string.section_moreMeasurements_plurals, "getString(...)"));
        LayoutInflater.from(context).inflate(C1987R.layout.section_other_measurements, this);
        setOrientation(1);
        View findViewById = findViewById(C1987R.id.title);
        u.i(findViewById, "findViewById(...)");
        this.f46482c = (SectionView) findViewById;
        View findViewById2 = findViewById(C1987R.id.subTitle);
        u.i(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = findViewById(C1987R.id.list);
        u.i(findViewById3, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f46480a = recyclerView;
        View findViewById4 = findViewById(C1987R.id.other_measurement_count);
        u.i(findViewById4, "findViewById(...)");
        this.f46481b = (LineCellView) findViewById4;
        zq.b.a(recyclerView, C1987R.drawable.list_divider_thick_with_margins, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c80.a.f22419o);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setTitle(obtainStyledAttributes.getString(4));
        textView.setText(obtainStyledAttributes.getString(1));
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || dp0.j.D(text)) ? 8 : 0);
        obtainStyledAttributes.getInt(0, 3);
        String string2 = obtainStyledAttributes.getString(3);
        string2 = string2 == null ? "" : string2;
        String string3 = obtainStyledAttributes.getString(2);
        this.f46483d = new j<>(string2, string3 != null ? string3 : "");
        y yVar = y.f85009a;
        obtainStyledAttributes.recycle();
    }
}
