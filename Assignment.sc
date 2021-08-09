object CaesarCipher {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  def encrypt(text:String, key:Int)=text.map{
    case c if alphabet.contains(c) => rot(alphabet, c, key)
    case c => c
  }
  
  def decrypt(text:String, key:Int)=encrypt(text, -key)
  
}

val text:String=""
text= readLine("Enter the text")

val key:Int=""
key= readLine("Enter the key")

val encrypted=CaesarCipher.encrypt(text,key)
println("Encrypted : " + encrypted)
println("Decrypted : " + CaesarCipher.decrypt(encrypted,key))

