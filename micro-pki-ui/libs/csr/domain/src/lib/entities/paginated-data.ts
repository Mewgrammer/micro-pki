export interface PaginatedData<T> {
  page: number,
  pageSize: number,
  pages: number,
  data: T[]
}
