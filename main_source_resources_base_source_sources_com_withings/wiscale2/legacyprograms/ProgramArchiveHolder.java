package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.programs.model.ProgramOld;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.legacyprograms.ProgramMenuActivity;
import com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity;
import dp0.j;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Bind;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import w9.g;
/* compiled from: WellnessProgramArchiveActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000fR\u001c\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramArchiveHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$ProgramWithIteration;", "programWithIteration", "", "kotlin.jvm.PlatformType", "getProgramStatusMessage", "(Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$ProgramWithIteration;)Ljava/lang/String;", "", "shouldShowDivider", "Lnm0/y;", Bind.ELEMENT, "(Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$ProgramWithIteration;Z)V", "Lcom/withings/programs/model/ProgramOld;", "program", "(Lcom/withings/programs/model/ProgramOld;Z)V", "Landroid/widget/TextView;", RemoteMessageConst.Notification.TAG, "Landroid/widget/TextView;", "name", "progress", "Landroid/widget/ImageView;", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "Landroid/widget/ImageView;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "Landroid/view/View;", "divider", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProgramArchiveHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private final View divider;
    private final ImageView image;
    private final TextView name;
    private final TextView progress;
    private final ProgressBar progressBar;
    private final TextView tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramArchiveHolder(View itemView) {
        super(itemView);
        u.j(itemView, "itemView");
        this.tag = (TextView) itemView.findViewById(C1987R.id.cell_item_ongoing_program_tag);
        this.name = (TextView) itemView.findViewById(C1987R.id.cell_item_ongoing_program_name);
        this.progress = (TextView) itemView.findViewById(C1987R.id.cell_item_ongoing_program_progress);
        this.image = (ImageView) itemView.findViewById(C1987R.id.cell_item_ongoing_program_image);
        this.progressBar = (ProgressBar) itemView.findViewById(C1987R.id.cell_item_ongoing_program_progress_bar);
        this.divider = itemView.findViewById(C1987R.id.divider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(ProgramArchiveHolder this$0, ProgramOld program, View view) {
        u.j(this$0, "this$0");
        u.j(program, "$program");
        Context context = this$0.itemView.getContext();
        ProgramMenuActivity.Companion companion = ProgramMenuActivity.Companion;
        Context context2 = this$0.itemView.getContext();
        u.i(context2, "getContext(...)");
        context.startActivity(companion.createIntent(context2, program));
    }

    private final String getProgramStatusMessage(WellnessProgramArchiveActivity.ProgramWithIteration programWithIteration) {
        if (programWithIteration.getIteration().getStatus() == 4) {
            return zq.b.b(this, C1987R.string._CANCELED_);
        }
        return new DateTime(programWithIteration.getIteration().getEnd()).toString("dd/MM/YYYY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void bind(WellnessProgramArchiveActivity.ProgramWithIteration programWithIteration, boolean z5) {
        u.j(programWithIteration, "programWithIteration");
        this.tag.setText(j.O(j.O(programWithIteration.getProgram().getSpecifics().getTags().toString(), "[", "", false), "]", "", false));
        this.name.setText(programWithIteration.getProgram().getSpecifics().getTitle());
        this.progress.setText(getProgramStatusMessage(programWithIteration));
        ImageView image = this.image;
        u.i(image, "image");
        String imageFull = programWithIteration.getProgram().getSpecifics().getImageFull();
        g a11 = w9.a.a(image.getContext());
        f.a aVar = new f.a(image.getContext());
        aVar.d(imageFull);
        aVar.q(image);
        a11.d(aVar.b());
        this.progressBar.setVisibility(8);
        this.divider.setVisibility(z5 ? 0 : 8);
        this.itemView.setOnClickListener(new Object());
    }

    public final void bind(ProgramOld program, boolean z5) {
        String urlFor256;
        u.j(program, "program");
        this.tag.setText(zq.b.b(this, C1987R.string._CHALLENGE_));
        this.name.setText(program.getName());
        this.progress.setText(new DateTime(program.getEndDate()).toString(DateTimeFormat.forPattern("dd/MM/YYYY")));
        ImagesP4 images = program.getImages();
        if (images != null && (urlFor256 = images.getUrlFor256()) != null) {
            ImageView image = this.image;
            u.i(image, "image");
            g a11 = w9.a.a(image.getContext());
            f.a aVar = new f.a(image.getContext());
            aVar.d(urlFor256);
            aVar.q(image);
            a11.d(aVar.b());
        }
        this.progressBar.setVisibility(8);
        this.divider.setVisibility(z5 ? 0 : 8);
        this.itemView.setOnClickListener(new com.withings.wiscale2.device.common.feature.afib.j(3, this, program));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(View view) {
    }
}
