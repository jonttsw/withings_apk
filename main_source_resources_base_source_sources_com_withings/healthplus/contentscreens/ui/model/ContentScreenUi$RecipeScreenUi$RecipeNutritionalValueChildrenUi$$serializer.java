package com.withings.healthplus.contentscreens.ui.model;

import com.google.firebase.messaging.Constants;
import com.withings.healthplus.contentscreens.ui.model.ContentScreenUi;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: ContentScreenUi.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/healthplus/contentscreens/ui/model/ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueChildrenUi.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer implements GeneratedSerializer<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueChildrenUi> {
    public static final int $stable = 0;
    public static final ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer contentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer = new ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer();
        INSTANCE = contentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.healthplus.contentscreens.ui.model.ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueChildrenUi", contentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(Constants.ScionAnalytics.PARAM_LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueChildrenUi deserialize(Decoder decoder) {
        String str;
        String str2;
        int i11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(descriptor2, 0);
            str2 = beginStructure.decodeStringElement(descriptor2, 1);
            i11 = 3;
        } else {
            boolean z5 = true;
            int i12 = 0;
            str = null;
            String str3 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z5 = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(descriptor2, 0);
                    i12 |= 1;
                } else if (decodeElementIndex != 1) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    str3 = beginStructure.decodeStringElement(descriptor2, 1);
                    i12 |= 2;
                }
            }
            str2 = str3;
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueChildrenUi(i11, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueChildrenUi value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueChildrenUi.write$Self$ui_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}