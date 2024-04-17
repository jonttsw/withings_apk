package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import nm0.y;
import ym0.p;
/* compiled from: RadioListView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/withings/design/view/RadioListView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function2;", "", "", "Lnm0/y;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemCheckedListener", "(Lym0/p;)V", "Lcom/withings/design/view/RadioListView$a;", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lcom/withings/design/view/RadioListView$a;", "getOnItemChecked", "()Lcom/withings/design/view/RadioListView$a;", "setOnItemChecked", "(Lcom/withings/design/view/RadioListView$a;)V", "onItemChecked", "value", "c", "Ljava/lang/Integer;", "getSelectedItem", "()Ljava/lang/Integer;", "setSelectedItem", "(Ljava/lang/Integer;)V", "selectedItem", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RadioListView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f36363a;

    /* renamed from: b  reason: collision with root package name */
    private a f36364b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f36365c;

    /* compiled from: RadioListView.kt */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: RadioListView.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f36366a;

        b(p pVar) {
            this.f36366a = pVar;
        }
    }

    public RadioListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final a getOnItemChecked() {
        return this.f36364b;
    }

    public final Integer getSelectedItem() {
        return this.f36365c;
    }

    public final void setOnItemChecked(a aVar) {
        this.f36364b = aVar;
    }

    public final void setOnItemCheckedListener(p<Object, ? super Integer, y> listener) {
        u.k(listener, "listener");
        this.f36364b = new b(listener);
    }

    public final void setSelectedItem(Integer num) {
        Integer num2 = this.f36365c;
        ArrayList arrayList = this.f36363a;
        if (num2 != null) {
            ((RadioListItemView) ((j) arrayList.get(num2.intValue())).d()).setChecked(false);
        }
        this.f36365c = num;
        if (num != null) {
            ((RadioListItemView) ((j) arrayList.get(num.intValue())).d()).setChecked(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioListView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.k(context, "context");
        setOrientation(1);
        this.f36363a = new ArrayList();
    }
}
