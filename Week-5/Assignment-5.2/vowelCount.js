function vowel_list(char) {
  return "aeiouAEIOU".includes(char);
}

function vowel_count(str1) {
  const vowelMap = new Map();
  var count = 0;
  for (let char of str1) {
    let str = char;
    if (vowel_list(str)) {
      count++;
      if (vowelMap.has(str)) {
        vowelMap.set(str, vowelMap.get(str) + 1);
      } else {
        vowelMap.set(str, 1);
      }
    }
  }
  console.log("total vowel in string is = " + count);

  return vowelMap;
}

console.log(vowel_count("The quick Abrown fox"));
