package com.withings.contentproviders.eightfit.model.content;

import com.withings.contentproviders.eightfit.model.content.EightFitContent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/* compiled from: EightFitContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/content/EightFitContent.EightFitRecommendedDevice.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EightFitContent$EightFitRecommendedDevice$$serializer implements GeneratedSerializer<EightFitContent.EightFitRecommendedDevice> {
    public static final EightFitContent$EightFitRecommendedDevice$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EightFitContent$EightFitRecommendedDevice$$serializer eightFitContent$EightFitRecommendedDevice$$serializer = new EightFitContent$EightFitRecommendedDevice$$serializer();
        INSTANCE = eightFitContent$EightFitRecommendedDevice$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.content.EightFitContent.EightFitRecommendedDevice", eightFitContent$EightFitRecommendedDevice$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("models", false);
        pluginGeneratedSerialDescriptor.addElement("required", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EightFitContent$EightFitRecommendedDevice$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = EightFitContent.EightFitRecommendedDevice.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EightFitContent.EightFitRecommendedDevice deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        boolean z5;
        int i11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = EightFitContent.EightFitRecommendedDevice.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            z5 = beginStructure.decodeBooleanElement(descriptor2, 1);
            i11 = 3;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            int i12 = 0;
            List list2 = null;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], list2);
                    i12 |= 1;
                } else if (decodeElementIndex != 1) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    z12 = beginStructure.decodeBooleanElement(descriptor2, 1);
                    i12 |= 2;
                }
            }
            list = list2;
            z5 = z12;
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new EightFitContent.EightFitRecommendedDevice(i11, list, z5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, EightFitContent.EightFitRecommendedDevice value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        EightFitContent.EightFitRecommendedDevice.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
