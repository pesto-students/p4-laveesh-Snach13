function hasDuplicates(numbers) {
  const set = new Set(numbers);

  const duplicates = numbers.filter((item) => {
    if (set.has(item)) {
      set.delete(item);
    } else {
      return item;
    }
  });

  console.log("duplicate values = " + duplicates);
  if (duplicates.length != 0) {
    return true; // array contains duplicate value
  } else {
    return false; // array does not contain duplicate value
  }
}

console.log(hasDuplicates([1, 1, 2, 2, 3, 4]));
console.log(hasDuplicates([1, 2, 4, 3, 2, 1]));
console.log(hasDuplicates([5, 5, 5, , 5, 2, 3, 4, 9, 9]));
