
import org.tensorflow.types.TInt32
import org.tensorflow.types.TInt64


/**
 * Creates a few tensors of ranks 0, 1, 2
 */
fun main() {
    // Rank 0 Tensor

    // https://github.com/tensorflow/java/tree/master/tensorflow-tools
    val rank0Tensor = TInt64.scalarOf(42L)
    println("DataType: " + rank0Tensor.dataType().name())
    println("Value: " + rank0Tensor.data())

    // Rank 1 Tensor
    val vector = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val rank1Tensor = TInt32.vectorOf(*vector)
    println("DataType: " + rank1Tensor.dataType().name())
    println("Value: " + rank1Tensor.data())
}

