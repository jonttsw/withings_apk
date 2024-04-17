package com.withings.contentproviders.eightfit.model.webservice;

import androidx.camera.camera2.internal.k0;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsRecipeContent.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeInstruction;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeInstruction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "title", "text", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeInstruction;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsRecipeInstruction {
    public static final Companion Companion = new Companion(null);
    @SerializedName("text")
    private final String text;
    @SerializedName("title")
    private final String title;

    /* compiled from: WsRecipeContent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\t"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeInstruction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeInstruction;", "toEntity", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeInstruction;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsRecipeInstruction> serializer() {
            return WsRecipeInstruction$$serializer.INSTANCE;
        }

        public final List<EightFitRecipeContent.Companion.EightFitRecipeInstruction> toEntity(List<WsRecipeInstruction> list) {
            u.j(list, "<this>");
            List<WsRecipeInstruction> list2 = list;
            ArrayList arrayList = new ArrayList(x.y(list2, 10));
            for (WsRecipeInstruction wsRecipeInstruction : list2) {
                arrayList.add(new EightFitRecipeContent.Companion.EightFitRecipeInstruction(wsRecipeInstruction.getTitle(), wsRecipeInstruction.getText()));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsRecipeInstruction(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, WsRecipeInstruction$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.text = str2;
    }

    public static /* synthetic */ WsRecipeInstruction copy$default(WsRecipeInstruction wsRecipeInstruction, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsRecipeInstruction.title;
        }
        if ((i11 & 2) != 0) {
            str2 = wsRecipeInstruction.text;
        }
        return wsRecipeInstruction.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsRecipeInstruction wsRecipeInstruction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsRecipeInstruction.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsRecipeInstruction.text);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final WsRecipeInstruction copy(String title, String text) {
        u.j(title, "title");
        u.j(text, "text");
        return new WsRecipeInstruction(title, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsRecipeInstruction)) {
            return false;
        }
        WsRecipeInstruction wsRecipeInstruction = (WsRecipeInstruction) obj;
        if (u.e(this.title, wsRecipeInstruction.title) && u.e(this.text, wsRecipeInstruction.text)) {
            return true;
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return k0.c("WsRecipeInstruction(title=", this.title, ", text=", this.text, ")");
    }

    public WsRecipeInstruction(String title, String text) {
        u.j(title, "title");
        u.j(text, "text");
        this.title = title;
        this.text = text;
    }
}
