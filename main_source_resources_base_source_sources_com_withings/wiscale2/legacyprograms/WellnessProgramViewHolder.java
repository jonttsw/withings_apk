package com.withings.wiscale2.legacyprograms;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.programs.model.program.ProgramDomain;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Bind;
/* compiled from: WellnessProgramsAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001a\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0016R#\u0010\u001f\u001a\n \r*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "wellnessProgram", "Lnm0/y;", Bind.ELEMENT, "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)V", "Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;", "getListener", "()Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "image$delegate", "Lnm0/g;", "getImage", "()Landroid/widget/ImageView;", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "title", "description$delegate", "getDescription", HealthConstants.FoodInfo.DESCRIPTION, "Lcom/google/android/material/card/MaterialCardView;", "container$delegate", "getContainer", "()Lcom/google/android/material/card/MaterialCardView;", "container", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramViewHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private final g container$delegate;
    private final g description$delegate;
    private final g image$delegate;
    private final ProgramClickListener listener;
    private final g title$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramViewHolder(View view, ProgramClickListener listener) {
        super(view);
        u.j(view, "view");
        u.j(listener, "listener");
        this.listener = listener;
        this.image$delegate = h.b(new WellnessProgramViewHolder$image$2(view));
        this.title$delegate = h.b(new WellnessProgramViewHolder$title$2(view));
        this.description$delegate = h.b(new WellnessProgramViewHolder$description$2(view));
        this.container$delegate = h.b(new WellnessProgramViewHolder$container$2(view));
    }

    public static final void bind$lambda$0(WellnessProgramViewHolder this$0, ProgramDomain.LegacyDomain wellnessProgram, View view) {
        u.j(this$0, "this$0");
        u.j(wellnessProgram, "$wellnessProgram");
        this$0.listener.onProgramClicked(wellnessProgram);
    }

    private final MaterialCardView getContainer() {
        return (MaterialCardView) this.container$delegate.getValue();
    }

    private final TextView getDescription() {
        return (TextView) this.description$delegate.getValue();
    }

    private final ImageView getImage() {
        return (ImageView) this.image$delegate.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.getValue();
    }

    public final void bind(ProgramDomain.LegacyDomain wellnessProgram) {
        u.j(wellnessProgram, "wellnessProgram");
        ImageView image = getImage();
        u.i(image, "<get-image>(...)");
        String imagePreview = wellnessProgram.getSpecifics().getImagePreview();
        w9.g a11 = w9.a.a(image.getContext());
        f.a aVar = new f.a(image.getContext());
        aVar.d(imagePreview);
        aVar.q(image);
        a11.d(aVar.b());
        getTitle().setText(wellnessProgram.getSpecifics().getTitle());
        getDescription().setText(wellnessProgram.getSpecifics().getSubtitle());
        getContainer().setOnClickListener(new za0.b(4, this, wellnessProgram));
    }

    public final ProgramClickListener getListener() {
        return this.listener;
    }
}
