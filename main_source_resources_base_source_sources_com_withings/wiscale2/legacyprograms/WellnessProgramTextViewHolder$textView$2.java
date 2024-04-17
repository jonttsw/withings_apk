package com.withings.wiscale2.legacyprograms;

import android.view.View;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WellnessProgramsAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WellnessProgramTextViewHolder$textView$2 extends w implements ym0.a<TextView> {
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramTextViewHolder$textView$2(View view) {
        super(0);
        this.$view = view;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final TextView invoke() {
        return (TextView) this.$view.findViewById(C1987R.id.wellness_program_item_text);
    }
}
